
public class Usuario extends Pessoa {

    public String nomeUsuario;
    protected String senhausuario;
    protected String emailusuario;
    public int idadeusuario;
    protected String celular;

    // Construtor Vazio
    public Usuario(){

    }

    // Construtor padrão
    public Usuario( String nomeUsuario){
        
        this.nomeUsuario = nomeUsuario;
    }

    // Construtor Sobrecarregado
    public Usuario( String nomeUsuario, String senhausuario, String emailusuario, int idadeusuario, String celular, String cpf){
        super(cpf);
        this.nomeUsuario = nomeUsuario;
        this.senhausuario = senhausuario;
        this.emailusuario = emailusuario;
        this.idadeusuario = idadeusuario;
        this.celular = celular;
    }
     
    // getters e setters
    public void setnomeUsuario( String nome){
        this.nomeUsuario = nome;
    }

    public String getnomeUsuario(){
        return this.nomeUsuario;
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