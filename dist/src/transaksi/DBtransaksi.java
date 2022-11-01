/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mobil.mobil;

/**
 *
 * @author Aldy Senda
 */
public class DBtransaksi {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117122penyewaan";
    public final String us = "root";
    public final String pass = "";
    
    //Menampilkan Semua Data Transaksi
    public ArrayList <transaksi> tampil_semua_transaksi()
    {
          ArrayList<transaksi> list = new ArrayList<transaksi>();
          Connection conn = null;
          Statement stmt = null;
          try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT t.no_nota, h.nama_hirepoint, c.nama_customer, m.no_polisi, t.tgl_pinjam, t.tgl_kembali, t.total_bayar\n" +
                    "FROM transaksi t \n" +
                    "JOIN hirepoint h ON t.id_hirePoint=h.id_hirePoint\n" +
                    "JOIN customer c ON t.id_customer=c.id_customer\n" +
                    "JOIN mobil m ON t.id_mobil=m.id_mobil\n" +
                    "WHERE t.no_nota=no_nota";
            ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
                  list.add(new transaksi(rs.getString("no_nota"), rs.getString("nama_hirepoint"), rs.getString("nama_customer")
                          ,rs.getString("no_polisi"),rs.getString("tgl_pinjam"),rs.getString("tgl_kembali"),rs.getInt("total_bayar")));
              }
              rs.close();
        } catch (Exception e) {
              System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try{
                conn.close();
            }
            catch(Exception e) {}
        }
          return list;
    }
    
    //Tambah Data Transaksi
    public void tambah_transaksi(transaksi t)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO transaksi values ('"+t.getNoNota()+"','"+t.getIdHirepoint()+"','"
                    + ""+t.getIdCustomer()+"','"+t.getIdMobil()+"','"+t.getTanggalPinjam()+"','"+t.getTanggalKembali()+"',"
                    + "'"+t.getTotalBayar()+"')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    //Hapus Data Transaksi
    public void hapus_transaksi(String no_nota)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM transaksi WHERE no_nota= '"+no_nota+"'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    //Update Data Transaksi
    public void update_transaksi(transaksi t)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE transaksi set id_hirePoint = '"+t.getIdHirepoint()+"',"+"id_customer = '"+t.getIdCustomer()+"',"
                    + ""+"id_mobil = '"+t.getIdMobil()+"',"+"tgl_pinjam = '"+t.getTanggalPinjam()+"',"
                    + ""+"tgl_kembali = '"+t.getTanggalKembali()+"',"+"total_bayar = '"+t.getTotalBayar()+"' "
                    + "WHERE no_nota= '"+t.getNoNota()+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
    }
    
    //Pilih Data Transaksi
    public transaksi pilih_transaksi(String no_nota)
    {
        transaksi t = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM transaksi WHERE no_nota = '"+no_nota+"'";
            ResultSet rs= stmt.executeQuery(sql);
            
            if (rs.next()) {
                t = new transaksi(rs.getString("no_nota"),rs.getString("id_hirePoint"),rs.getString("id_customer"),
                        rs.getString("id_mobil"),rs.getString("tgl_pinjam"),rs.getString("tgl_kembali"),rs.getInt("total_bayar"));
            } else {
                t = null;
                rs.close();
            }
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
        return t;
    }
    
    //Filter Data Transaksi
    public ArrayList<transaksi> filter_transaksi (String key)
    {
        ArrayList<transaksi> listtransaksi= new ArrayList<transaksi>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM transaksi WHERE no_nota like  '%"+key+"%'";
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()) {
                 listtransaksi.add(new transaksi(rs.getString("no_nota"),rs.getString("id_hirepoint"),rs.getString("id_customer"),
                         rs.getString("id_mobil"),rs.getString("tgl_pinjam"),rs.getString("tgl_kembali"),rs.getInt("total_bayar")));
            } 
            rs.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            try {
                stmt.close();
            } catch (Exception e) {}
            try {
                conn.close();
            } catch (Exception e) {}
        }
        return listtransaksi;
    }
}
