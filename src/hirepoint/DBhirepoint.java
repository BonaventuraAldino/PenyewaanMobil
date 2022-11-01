/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirepoint;

import hirepoint.*;
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
public class DBhirepoint {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117122penyewaan";
    public final String us = "root";
    public final String pass = "";
    
    //Menampilkan Semua Data hirepoint
    public ArrayList <hirepoint> tampil_semua_hirepoint()
    {
          ArrayList<hirepoint> list = new ArrayList<hirepoint>();
          Connection conn = null;
          Statement stmt = null;
          try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM hirepoint";
            ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
                  list.add(new hirepoint(rs.getString("id_hirepoint"), rs.getString("nama_hirepoint"), rs.getString("alamat_hirepoint")
                          ,rs.getString("kota_hirepoint"),rs.getString("telepon_hirepoint")));
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
    public void tambah_hirepoint(hirepoint c)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO hirepoint values ('"+c.getId()+"','"+c.getNama()+"','"
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
    
    //Hapus Data Hirepoint
    public void hapus_hirepoint(String id_hirepoint)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM hirepoint WHERE id_hirepoint= '"+id_hirepoint+"'";
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
    
    //Update Data Hirepoint
    public void update_hirepoint(hirepoint m)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE hirepoint set nama_hirepoint = '"+m.getNama()+"',"+"alamat_hirepoint = '"+m.getAlamat()+"',"
                    + ""+"kota_hirepoint = '"+m.getKota()+"',"
                    + ""+"telepon_hirepoint = '"+m.getTelepon()+"' WHERE id_hirepoint = '"+m.getId()+"'";
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
    
    //Pilih Data Hirepoint
    public hirepoint pilih_hirepoint(String id_hirepoint)
    {
        hirepoint c = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM hirepoint WHERE id_hirepoint = '"+id_hirepoint+"'";
            ResultSet rs= stmt.executeQuery(sql);
            
            if (rs.next()) {
                c = new hirepoint (rs.getString("id_hirepoint"),rs.getString("nama_hirepoint"),rs.getString("alamat_hirepoint"),
                        rs.getString("kota_hirepoint"),rs.getString("telepon_hirepoint"));
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
    
    //Filter Data Hirepoint
    public ArrayList<hirepoint> filter_hirepoint (String key)
    {
        ArrayList<hirepoint> listhirepoint = new ArrayList<hirepoint>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM hirepoint WHERE nama_hirepoint like  '%"+key+"%'";
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()) {
                listhirepoint.add(new hirepoint(rs.getString("id_hirepoint"),rs.getString("nama_hirepoint"),rs.getString("alamat_depot"),
                        rs.getString("kota_hirepoint"),rs.getString("telepon_hirepoint")));
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
        return listhirepoint;
    }
}
