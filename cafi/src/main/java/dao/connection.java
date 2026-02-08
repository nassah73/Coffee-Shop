package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
      public static String url="jdbc:mysql://localhost:3306/cliente";
     public static connection connection(){
         try{
             return (connection) DriverManager.getConnection(url,"root" ,"Hassan@12");
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
