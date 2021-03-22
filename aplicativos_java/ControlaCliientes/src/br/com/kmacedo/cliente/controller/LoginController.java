package br.com.kmacedo.cliente.controller;

import br.com.kmacedo.cliente.dao.LoginDao;
import br.com.kmacedo.cliente.model.Login;
import java.util.ArrayList;
import java.sql.SQLException;

public class LoginController {
    
    public ArrayList<Login> getLoginSenha() throws SQLException, ClassNotFoundException{
        return LoginDao.getLogin();
    }
}
