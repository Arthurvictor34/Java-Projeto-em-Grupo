
public class Usuario {

    private String nome;
    private String senhausuario;
    private String emailusuario;
    private int idadeusuario;
    private String celular;

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