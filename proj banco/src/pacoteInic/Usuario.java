package pacoteInic;

public class Usuario {
    private String nome;
    private String cpf;
    private String senha;
    private String sobrenome;
    private String usuario;
    private String tipo;
    private double taxam;
    private double taxaa;
    private String cpff;
    /**
     * @return the id
     */
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
   
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    /**
     * @return the login
     */
    public String getCpf() {
        return cpf;
    }


    /**
     * @param login the login to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTaxam() {
        return taxam;
    }

    public void setTaxam(double taxam) {
        this.taxam = taxam;
    }
    public double getTaxaa() {
        return taxaa;
    }

    public void setTaxaa(double taxaa) {
        this.taxaa = taxaa;
    }
    
    
    
}