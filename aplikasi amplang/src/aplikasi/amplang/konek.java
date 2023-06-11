/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.amplang;
import java.sql.*;
/**
 *
 * @author USER
 */
public class konek {
//        public String url = "jdbc:mysql://localhost:3306/amplang"; 
//        public String username = "root"; 
//        public String password = ""; 
//    
//    public konek(){
//
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//            System.out.println("berhasil terhubung ke database");
//
//            connection.close();
//            System.out.println("Disconnected from the database!");
//        } catch (SQLException e) {
//            System.err.println("gagal terhubung ke database!");
//            e.printStackTrace();
//        }
//    }
    private static java.sql.Connection koneksi = null;
        
        public static java.sql.Connection getkoneksi(){
        if(koneksi == null){
        try{
            String url = "jdbc:mysql://localhost:3306/amplang"; 
            String user= "root"; 
            String password = ""; 
            DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("berhasil terhubung ke database");
            
        }catch(Exception e){
           System.out.println("eror"+e);   
        }   
        }return koneksi;
    };
    
    public static void main(String args[]){
        getkoneksi();
    }
}