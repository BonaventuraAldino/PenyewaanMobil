/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.DriverManager;

/**
 *
 * @author Aldy Senda
 */
public class koneksi {
    private static java.sql.Connection koneksi;
    public static java.sql.Connection getkoneksi(){
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/db10117122penyewaan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
}
