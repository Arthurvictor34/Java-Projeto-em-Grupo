public abstract class Pessoa extends Usuario {
    protected String cpf;

    public Pessoa ( String nome, String senhausuario, String emailusuario, int idadeusuario, String celular, String cpf){
        super(nome, senhausuario, emailusuario, idadeusuario, celular);
        this.cpf = cpf;
    }
   
    public void setCPF( String cpf){
        this.cpf = cpf;
    }

    public String getCPF(){
        return this.cpf;
    }
}
