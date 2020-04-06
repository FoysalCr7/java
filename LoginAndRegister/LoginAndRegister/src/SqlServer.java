/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
 import javax.swing.*;
/**
 *
 * @author dcL
 */
public class SqlServer {
    
    



 

    Connection conn=null;
    public static Connection ConnectToDB()   {
       try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=1234;"+"databaseName=project");
         
         //JOptionPane.showMessageDialog(null, "Connected");
         return conn;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
    }
}
    

