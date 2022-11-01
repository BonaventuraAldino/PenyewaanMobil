/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import hirepoint.hirepoint;
import mobil.mobil;
import mobil.Ftambahmobil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldy Senda
 */
public class DBmobil {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117122penyewaan";
    public final String us = "root";
    public final String pass = "";
    
    //Menampilkan Semua Data hirepoint
    public ArrayList <mobil> tampil_semua_mobil()
    {
          ArrayList<mobil> list = new ArrayList<mobil>();
          Connection conn = null;
          Statement stmt = null;
          try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT m.id_mobil, d.nama_depot nama_depot, m.no_polisi, m.merk, m.tahun_buat, m.isi_silinder, m.warna, "
                    + "m.bahan_bakar,m.status, m.harga_sewa FROM mobil m JOIN depot d ON m.id_depot=d.id_depot "
                    + "WHERE m.id_mobil=id_mobil";
            ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
                  list.add(new mobil(rs.getString("id_mobil"), rs.getString("nama_depot"), rs.getString("no_polisi")
                          ,rs.getString("merk"),rs.getString("tahun_buat"),rs.getString("isi_silinder"),rs.getString("warna"),
                          rs.getString("bahan_bakar"),rs.getString("status"),rs.getInt("harga_sewa")));
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
    
    //Tambah Data hirepoint
    public void tambah_mobil(mobil m)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO mobil values ('"+m.getIdMobil()+"','"+m.getIdDepot()+"','"
                    + ""+m.getNoPolisi()+"','"+m.getMerk()+"','"+m.getTahunBuat()+"','"+m.getIsiSilinder()+"','"+m.getWarna()+"',"
                    + "'"+m.getBahanBakar()+"','"+m.getStatus()+"','"+m.getHargaSewa()+"')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
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
    
    //Hapus Data Mobil
    public void hapus_mobil(String id_mobil)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM hirepoint WHERE id_mobil= '"+id_mobil+"'";
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
    
    //Update Data Mobil
    public void update_mobil(mobil m)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE mobil set id_depot = '"+m.getIdDepot()+"',"+"no_polisi = '"+m.getNoPolisi()+"',"
                    + ""+"merk = '"+m.getMerk()+"',"+"tahun_buat = '"+m.getTahunBuat()+"',"+"isi_silinder = '"+m.getIsiSilinder()+"',"
                    + ""+"warna = '"+m.getWarna()+"',"+"bahan_bakar = '"+m.getBahanBakar()+"',"+"status = '"+m.getStatus()+"',"
                    + ""+"harga_sewa = '"+m.getHargaSewa()+"' WHERE id_mobil = '"+m.getIdMobil()+"'";
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
    
    //Pilih Data Mobil
    public mobil pilih_mobil(String id_mobil)
    {
        mobil m = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM mobil WHERE id_mobil = '"+id_mobil+"'";
            ResultSet rs= stmt.executeQuery(sql);
            
            if (rs.next()) {
                m = new mobil (rs.getString("id_mobil"),rs.getString("id_depot"),rs.getString("no_polisi"),rs.getString("merk"),
                        rs.getString("tahun_buat"),rs.getString("isi_silinder"),rs.getString("warna"),rs.getString("bahan_bakar"),
                rs.getString("status"),rs.getInt("harga_sewa"));
            } else {
                m = null;
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
        return m;
    }
    
    //Filter Data Mobil
    public ArrayList<mobil> filter_mobil (String key)
    {
        ArrayList<mobil> listmobil = new ArrayList<mobil>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM mobil WHERE no_polisi like  '%"+key+"%'";
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()) {
                 listmobil.add(new mobil (rs.getString("id_mobil"),rs.getString("id_depot"),rs.getString("no_polisi"),rs.getString("merk"),
                        rs.getString("tahun_buat"),rs.getString("isi_silinder"),rs.getString("warna"),rs.getString("bahan_bakar"),
                rs.getString("status"),rs.getInt("harga_sewa")));
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
        return listmobil;
    }
}
