package pacoteInic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacoteAdm.telaAdm;

public class usuarioDao {

    public void inserir(Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos

        //int lcodigo = obj.getCodigo();
        String lnome = obj.getNome();
        String lsobrenome = obj.getSobrenome();
        String lcpf = obj.getCpf();
        String lusuario = obj.getUsuario();
        String lsenha = obj.getSenha();
        String ltipo = obj.getTipo();
        objBanco.conectar();

        try {
            String sql = "INSERT into pessoa(nome_pes, sobrenome_pes,cpf_pes,usuario_pes, senha_pes,tipo_pes)"
                    + " VALUES (?,?,?,?,?,?)";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            //  objPst.setInt(1, lcodigo);
            objPst.setString(1, lnome);
            objPst.setString(2, lsobrenome);
            objPst.setString(3, lcpf);
            objPst.setString(4, lusuario);
            objPst.setString(5, lsenha);
            objPst.setString(6, ltipo);
            objPst.execute();
            JOptionPane.showMessageDialog(null, lnome + " - Cadastrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de execução no insert:" + ex.getMessage());
        }
    }

    public void inserirt(Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos
        String lcpf = obj.getCpf();
        objBanco.conectar();
        try {
            String sql = "INSERT into spessoa(cpf_pes)"
                    + " VALUES (?)";
            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lcpf);
            objPst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de execução no insert2:" + ex.getMessage());
        }
    }

    public void mudtaxaA(pacoteAdm.Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos

        double ltaxaa = obj.getTaxaa();
        objBanco.conectar();

        try {
            String sql = "UPDATE  juroanual SET juro_anual =  ? WHERE  id =  1";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            objPst.setDouble(1, ltaxaa);
            objPst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no update:" + ex.getMessage());
        }
    }

    public void mudtaxaM(pacoteAdm.Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos

        double ltaxam = obj.getTaxam();
        objBanco.conectar();

        try {
            String sql = "UPDATE  juromensal SET juro_mensal =  ? WHERE  id =  1";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            objPst.setDouble(1, ltaxam);
            objPst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no update:" + ex.getMessage());
        }

    }

    public void alterarpes(Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos

        String lcpf = obj.getCpf();
        String lsenha = obj.getSenha();
        objBanco.conectar();

        try {
            String sql = "UPDATE  pessoa SET  senha_pes =  ? WHERE  cpf_pes =  ?";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);

            objPst.setString(1, lsenha);
            objPst.setString(2, lcpf);
            objPst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no update:" + ex.getMessage());
        }
    }

    public void deletarpes(pacoteAdm.Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos
        String lcpf = obj.getCpf();
        objBanco.conectar();
        try {
            String sql = "DELETE FROM spessoa WHERE cpf_pes =  ?";
            String sql2 = "DELETE FROM pessoa WHERE cpf_pes = ?";
            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            PreparedStatement objPst2
                    = objBanco.conexao.prepareStatement(sql2);
            objPst.setString(1, lcpf);
            objPst2.setString(1, lcpf);
            objPst.execute();
            objPst2.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no delete:" + ex.getMessage());
        }
    }

    public void alterarpes(pacoteAdm.Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos

        String lcpf = obj.getCpf();
        String lsenha = obj.getSenha();
        objBanco.conectar();

        try {
            String sql = "UPDATE  pessoa SET senha_pes =  ? WHERE  cpf_pes =  ?";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, lsenha);
            objPst.setString(2, lcpf);
            objPst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no update:" + ex.getMessage());
        }
    }

    public ResultSet selecionarUsuario(Usuario objAcesso) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos
        objBanco.conectar();
        try {
            String sql = "SELECT * FROM pessoa where cpf_pes = ?";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);

            objPst.setString(1, objAcesso.getCpf());

            ResultSet objRst = objPst.executeQuery();
            return objRst;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no Select:" + ex.getMessage());
        }
        return null;
    }

    public ResultSet selecionarTipo(Usuario obj) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        objBanco.conectar();
        try {
            String tsql = "SELECT tipo_pes FROM pessoa WHERE cpf_pes = ?";
            PreparedStatement tobjPst
                    = objBanco.conexao.prepareStatement(tsql);
            tobjPst.setString(1, obj.getCpf());
            ResultSet objRst = tobjPst.executeQuery();

            return objRst;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no Select:" + ex.getMessage());
        }
        return null;
    }

    public ResultSet selecionarTaxas() {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        objBanco.conectar();
        try {
            String sql = "SELECT juro_mensal, juro_anual FROM juroanual, juromensal";
            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            ResultSet objRst = objPst.executeQuery();
            return objRst;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no Select:" + ex.getMessage());
        }
        return null;
    }

    public ResultSet selecionarSaldo(Usuario objAcesso) {
        ConexaoMySQL objBanco = new ConexaoMySQL();
//os valore dos atributos
        objBanco.conectar();
        try {
            String sql = "SELECT saldo_spes FROM spessoa WHERE cpf_pes = ?";

            PreparedStatement objPst
                    = objBanco.conexao.prepareStatement(sql);
            objPst.setString(1, objAcesso.getCpf());
            
            ResultSet objRs = objPst.executeQuery();
            return objRs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro de execução no Select:" + ex.getMessage());
        }
        return null;
    }


    /*public ResultSet selecionarInfo() {
        ConexaoMySQL objBanco = new ConexaoMySQL();
        objBanco.conectar();

    }*/
}
