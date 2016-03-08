package sqlitedatabaseconnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ram Alapure
 */
import java.sql.*;

public class SqlConnection 
{
    public static Connection DbConnector()
    {
    Connection conn=null;
        try{
            //https://bitbucket.org/xerial/sqlite-jdbc/downloads
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:UserDatabase.sqlite");
           
            return conn;
            
            }catch(ClassNotFoundException | SQLException e)
             {
              System.out.println(e);
                
             } 
        return null;
    }
   
}
