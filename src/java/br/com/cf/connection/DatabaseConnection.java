package br.com.cf.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    static{
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            
        }
    }
    
    public Connection getConnection(){
        
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ControleFinanceiro", "postgres", "postgres");
            System.out.println("Database opened");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
}
