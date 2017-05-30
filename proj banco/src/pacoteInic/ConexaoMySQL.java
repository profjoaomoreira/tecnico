package pacoteInic;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class ConexaoMySQL {

    
   String url = "jdbc:mysql://www.cantinakisabor.com.br:3306/canti830_bancojava";
    String usuario = "canti830_brunof";
    String senha = "1238524679";
   // String url = "jdbc:mysql://127.0.0.1:3306/bancojava";
    //String usuario = "root";
    //String senha = "";
    public Connection conexao = null;

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao
                    = (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Problema no momento de carregar o Driver do banco:"
                    + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Problemas ao conectar ao banco:" + ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            this.conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Problemas ao fechar o banco:" + ex.getMessage());
        }
    }

    public void executarComando(String sql) {
        try {
            Statement objStm = (Statement) conexao.createStatement();
            objStm.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao executar o comando:" + ex.getMessage());
        }
    }

    public ResultSet executarConsulta(String sql) {
        try {
            Statement objStm = (Statement) conexao.createStatement();
            ResultSet objRs = objStm.executeQuery(sql);
            return objRs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao executar o comando:" + ex.getMessage());
        }
        return null;
    }

}
