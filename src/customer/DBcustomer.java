/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

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
public class DBcustomer {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117122penyewaan";
    public final String us = "root";
    public final String pass = "";
    
    //Menampilkan Semua Data Customer
    public ArrayList <customer> tampil_semua_customer()
    {
          ArrayList<customer> list = new ArrayList<customer>();
          Connection conn = null;
          Statement stmt = null;
          try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM customer";
            ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
                  list.add(new customer(rs.getString("id_customer"), rs.getString("nama_customer"), rs.getString("alamat_customer")
                          ,rs.getString("kota_customer"),rs.getString("telepon_customer")));
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
    
    //Tambah Data Customer
    public void tambah_customer(customer c)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO customer values ('"+c.getId()+"','"+c.getNama()+"','"
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
    public void hapus_customer(String id_customer)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM customer WHERE id_customer = '"+id_customer+"'";
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
    public void update_customer(customer m)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE customer set nama_customer = '"+m.getNama()+"',"+"alamat_customer = '"+m.getAlamat()+"',"
                    + ""+"kota_customer = '"+m.getKota()+"',"
                    + ""+"telepon_customer = '"+m.getTelepon()+"' WHERE id_customer = '"+m.getId()+"'";
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
    public customer pilih_customer(String id_customer)
    {
        customer c = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM customer WHERE id_customer = '"+id_customer+"'";
            ResultSet rs= stmt.executeQuery(sql);
            
            if (rs.next()) {
                c = new customer (rs.getString("id_customer"),rs.getString("nama_customer"),rs.getString("alamat_customer"),
                        rs.getString("kota_customer"),rs.getString("telepon_customer"));
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
    public ArrayList<customer> filter_customer (String key)
    {
        ArrayList<customer> listcustomer = new ArrayList<customer>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, us, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM customer WHERE nama_customer like  '%"+key+"%'";
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()) {
                listcustomer.add(new customer(rs.getString("id_customer"),rs.getString("nama_customer"),rs.getString("alamat_customer"),
                        rs.getString("kota_customer"),rs.getString("telepon_customer")));
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
        return listcustomer;
    }
}
