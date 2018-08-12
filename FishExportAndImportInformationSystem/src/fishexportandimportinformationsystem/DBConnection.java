package fishexportandimportinformationsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {

   String url="jdbc:sqlserver://DESKTOP-I70JU22\\FAHADSQL:1433;databaseName=Fish_Import_Export_Information_System";
   String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
   Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   Statement st=null;
   String user="Fish_Import_And_Export_Information_System";
   String password="171351996";
   
   
   public void dbconnection(){
       try{
       Class.forName(driver);
       con=DriverManager.getConnection(url,user,password);
       st=con.createStatement();
   }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
}
