package br.com.kmacedo.cliente.dao;

import br.com.kmacedo.cliente.model.Login;
import br.com.kmacedo.cliente.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDao {
    
    public static ArrayList<Login> getLogin() throws SQLException {
        ArrayList<Login> loginAux = new ArrayList<>();
        String sql = "select log_nome, log_senha from login";
        
        Connection conn = ConnectionFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            Login login = new Login();
            login.setLogin(rs.getString("log_nome"));
            login.setSenha(rs.getString("log_senha"));
            
            loginAux.add(login);
        }
        
        return loginAux;
    }
}
