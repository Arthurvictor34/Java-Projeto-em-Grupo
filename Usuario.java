
public class Usuario {

    public String nome;
    protected String senhausuario;
    protected String emailusuario;
    public int idadeusuario;
    protected String celular;

    // Construtor Vazio
    public Usuario(){

    }

    // Construtor padrão
    public Usuario( String nome){
        this.nome = nome;
    }

    // Construtor Sobrecarregado
    public Usuario( String nome, String senhausuario, String emailusuario, int idadeusuario, String celular){
        this.nome = nome;
        this.senhausuario = senhausuario;
        this.emailusuario = emailusuario;
        this.idadeusuario = idadeusuario;
        this.celular = celular;
    }
     
    // getters e setters
    public void setNome( String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSenhaUsuario( String senhausuario){
        this.senhausuario = senhausuario;
    }

    public String getSenhaDoUsuario(){
        return this.senhausuario;
    }

    public void setEmailUsuario( String emailusuario){
        this.emailusuario = emailusuario;
    }

    public String getEmailUsuario(){
        return this.emailusuario;
    }

    public void setIdadeUsuario( int idadeusuario){
        this.idadeusuario = idadeusuario;
    }

    public int getIdadeUsuario(){
        return this.idadeusuario;
    }

    public void setCelular( String celular ){
        this.celular = celular;
    }

    public String getCelular(){
        return this.celular;
    }

}