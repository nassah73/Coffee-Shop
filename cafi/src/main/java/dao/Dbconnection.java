package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
      public static String url="jdbc:mysql://localhost:3306/cliente";
     public static Connection getconnection(){
         try{
             Connection conne = DriverManager.getConnection(url,"root" ,"Hassan@12");
return  conne;
         } catch (SQLException e) {
             throw new RuntimeException(e);

         }
     }
}
