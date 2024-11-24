public abstract class Pessoa {
    protected String cpf;

    public Pessoa(){
        // Construtor Vazio
    }

    // Construtor Padrão
    public Pessoa (String cpf){
        this.cpf = cpf;
    }
   
    // Getters e Setters
    public void setCPF( String cpf){
        this.cpf = cpf;
    }

    public String getCPF(){
        return this.cpf;
    }
}
