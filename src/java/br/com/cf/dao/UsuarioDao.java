package br.com.cf.dao;

import br.com.cf.bean.Usuario;
import br.com.cf.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDao {

    public static boolean login(String usuario, String senha) {
        try {
            Connection connection = ConnectionManager.getConnection();

            String sql = "SELECT id FROM usuario WHERE usuario = ? AND senha = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, senha);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                if (resultSet.getInt("id") != 0) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean cadastrar(Usuario usuario) {
        try {
            Connection connection = ConnectionManager.getConnection();

            String sql = "INSERT INTO usuario(nome, usuario, senha) VALUES(?,?,?);";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getUsuario());
            statement.setString(3, usuario.getSenha());

            return (statement.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static Usuario getUsuario(long id) {

        try {
            Connection connection = ConnectionManager.getConnection();

            String sql = "SELECT nome, usuario FROM usuario WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);

            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                if (rs.getInt("id") != 0) {
                    return new Usuario(id, rs.getString("nome"), rs.getString("usuario"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
