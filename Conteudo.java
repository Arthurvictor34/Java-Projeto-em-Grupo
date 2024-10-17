
public class Conteudo {
 
    private String titulo; // Titulo da serie, filme, documentario e etc...
    private String genero; // Genero do filme, serie, documentario e etc...
    private int classificacaoindicada; //o filme, serie, documentario entre outros é pra maiores de 18, para maiores de 16 e etc..
    private String idioma; // escolher o audio em Portugues, ingles, espanhol e etc...
    private String legenda; // escolher a lengenda em Portugues, ingles, espanhol e etc...

    // Construtor Vazio
    public Conteudo(){

    }

    // Construtor padrão
    public Conteudo( String titulo){
        this.titulo = titulo;
    }

    // Construtor Sobrecarregado
    public Conteudo( String titulo, String genero, int classificacaoindicada, String idioma, String legenda){
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoindicada = classificacaoindicada;
        this.idioma = idioma;
        this.legenda = legenda;
    }
    
    //getters e setters
    public void setTitulo( String titulo ){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setGenero( String genero ){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setClassificacaoIndicada( int classificacaoindicada){
        this.classificacaoindicada = classificacaoindicada;
    }

    public int getClassificacaoIndicada(){
        return this.classificacaoindicada;
    }

    public void setIdioma( String idioma){
        this.idioma = idioma;
    }

    public String getIdioma(){
        return this.idioma;
    }

    public void setLegenda( String legenda ){
        this.legenda = legenda;
    }

    public String getLegenda(){
        return this.legenda;
    }

}