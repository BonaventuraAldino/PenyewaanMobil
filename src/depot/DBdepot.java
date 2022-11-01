/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depot;

import depot.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Aldy Senda
 */
public class DBdepot {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117122penyewaan";
    public final String us = "root";
    public final String pass = "";
    
    //Menampilkan Semua Data depot
    public ArrayList <depot> tampil_semua_depot()
    {
          ArrayList<depot> list = new ArrayList<depot>();
          Connection conn = null;
          Statement stmt = null;
          try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM depot";
            ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
                  list.add(new depot(rs.getString("id_depot"), rs.getString("nama_depot"), rs.getString("alamat_depot")
                          ,rs.getString("kota_depot"),rs.getString("telepon_depot")));
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
    
    //Tambah Data depot
    public void tambah_depot(depot c)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO depot values ('"+c.getId()+"','"+c.getNama()+"','"
                    + ""+c.getAlamat()+"','"+c.getKota()+"','"+c.getTelepon()+"')";
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
    
    //Hapus Data Mahasiswa
    public void hapus_depot(String id_depot)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM depot WHERE id_depot= '"+id_depot+"'";
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
    
    //Update Data Mahasiswa
    public void update_depot(depot m)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE depot set nama_depot = '"+m.getNama()+"',"+"alamat_depot = '"+m.getAlamat()+"',"
                    + ""+"kota_depot = '"+m.getKota()+"',"
                    + ""+"telepon_depot = '"+m.getTelepon()+"' WHERE id_depot = '"+m.getId()+"'";
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
    //Pilih Data Mahasiswa
    public depot pilih_depot(String id_depot)
    {
        depot c = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM depot WHERE id_depot = '"+id_depot+"'";
            ResultSet rs= stmt.executeQuery(sql);
            
            if (rs.next()) {
                c = new depot (rs.getString("id_depot"),rs.getString("nama_depot"),rs.getString("alamat_depot"),
                        rs.getString("kota_depot"),rs.getString("telepon_depot"));
            } else {
                c = null;
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
        return c;
    }
    
    //Filter Data Mahasiswa
    public ArrayList<depot> filter_depot (String key)
    {
        ArrayList<depot> listdepot = new ArrayList<depot>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM depot WHERE nama_depot like  '%"+key+"%'";
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()) {
                listdepot.add(new depot(rs.getString("id_depot"),rs.getString("nama_depot"),rs.getString("alamat_depot"),
                        rs.getString("kota_depot"),rs.getString("telepon_depot")));
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
        return listdepot;
    }
}
