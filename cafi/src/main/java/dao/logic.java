package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class logic {
    public void insert(client cl) throws SQLException {
         String sql="insert into client(name,prename,password,conferme_password)values(?,?,?,?);";
        try{
            Connection conn =  Dbconnection.getconnection();
            PreparedStatement Pr =conn.prepareStatement(sql);
            Pr.setString(1,cl.);
        }
    }
}
