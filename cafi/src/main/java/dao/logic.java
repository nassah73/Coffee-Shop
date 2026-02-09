package dao;
import control.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class logic {
    public static void  insert(client cl) throws SQLException {
         String sql="insert into client(name,prename,password,conferme_password)values(?,?,?,?);";
        try{
            Connection conn =  Dbconnection.getconnection();
            PreparedStatement Pr =conn.prepareStatement(sql);
            Pr.setString(1,cl.getName());
            Pr.setString(2,cl.getPrename());
            Pr.setString(3,cl.getPassword());
            Pr.setString(4,cl.getConfige_password());
            Pr.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
