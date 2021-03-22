package br.com.kmacedo.cliente.dao;

import br.com.kmacedo.cliente.util.ConnectionFactory;
import java.sql.SQLException;
import java.sql.Connection;

public abstract class Dao <Entity> {
    
    protected Connection obterConexao() throws SQLException{
        return ConnectionFactory.getConexao();
    }
    
    public abstract boolean cadastrar(Entity pojo) throws SQLException;
    public abstract boolean atualizar(Entity pojo) throws SQLException;
    public abstract boolean excluir(Entity pojo) throws SQLException;
    public abstract boolean getCodigo(Entity pojo) throws SQLException;
}
