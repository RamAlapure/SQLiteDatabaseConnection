/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitedatabaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Ram
 */
public class SQLiteDatabaseConnection extends Application {
    Connection conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX 8 Tutorial 14 - SQLite Database Connection");
       
        CheckConnection();
        
        //primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void CheckConnection(){
        conn = SqlConnection.DbConnector();
        if(conn == null){
            System.out.println("Connection not successful");
            System.exit(1);
        }
        else{
            System.out.println("Connection  successful");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
