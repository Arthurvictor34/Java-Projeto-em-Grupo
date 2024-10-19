
public class Assinatura {

    private String nomeassinatura;
    private String descriçãoassinatura;
    private double preçoassinatura;
    private int qtelassimultanea; // Quantidade de telas simultanea
    private String conteudoadicional; // 4k, Dolby Vision e etc...
    
    // Construtor Vazio
    public Assinatura(){

    }

    // Construtor padrão
    public Assinatura( String nomeassinatura){
        this.nomeassinatura = nomeassinatura;
    }

    // Construtor Sobrecarregado
    public Assinatura( String nomeassinatura, String descriçãoassinatura, float preçoassinatura, int qtelassimultanea, String conteudoadicional){
        this.nomeassinatura = nomeassinatura;
        this.descriçãoassinatura = descriçãoassinatura;
        this.preçoassinatura = preçoassinatura;
        this.qtelassimultanea = qtelassimultanea;
        this.conteudoadicional = conteudoadicional;
    }
    
    //getters e setters
    public void setNomeDaAssinatura( String nomeassinatura ){
        this.nomeassinatura = nomeassinatura;
    }

    public String getNomedaAssinatura(){
        return this.nomeassinatura;
    }

    public void setDescriçãoDaAssinatura( String descriçãoassinatura ){
        this.descriçãoassinatura = descriçãoassinatura;
    }

    public String getDescriçãoDaAssinatura(){
        return this.descriçãoassinatura;
    }

    public void setPreçoDaAssinatura( double preçoassinatura){
        this.preçoassinatura = preçoassinatura;
    }

    public double getPreçoDaAssinatura(){
        return this.preçoassinatura;
    }

    public void setqtDeTelasSimultanea( int qtelassimultanea){
        this.qtelassimultanea = qtelassimultanea;
    }

    public int getqtDeTelasSimultanea(){
        return this.qtelassimultanea;
    }

    public void setConteudoAdicional( String conteudoadicional ){
        this.conteudoadicional = conteudoadicional;
    }

    public String getConteudoAdicional(){
        return this.conteudoadicional;
    }


}