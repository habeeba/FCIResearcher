/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsw;

import java.sql.*;

/**
 *
 * @author PC0
 */
public class DBConnect {
    public Connection con;
    public Statement st;
    public ResultSet rs;

    public DBConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        }catch(Exception ex){
            System.out.println("error"+ex);
        }
    }
    
    
    
}
