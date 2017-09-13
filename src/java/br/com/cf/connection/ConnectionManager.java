package br.com.cf.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String DB_RESOURCE = "jdbc:postgresql://localhost:5432/ControleFinanceiro";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "postgres";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver do Banco de Dados.\n\n" + ex.getMessage());
        }
    }

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_RESOURCE, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar ao Banco de Dados.\n\n" + ex.getMessage());
        }

        return connection;
    }
}
