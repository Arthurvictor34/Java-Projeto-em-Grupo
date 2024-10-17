
public class Plataformas {

    private String nomeplataforma;
    private String resoluçãovideo; // maxima resulução suportada pela plataforma
    private String sistemaperacionalcompativel;
    private String quanlidadevideo;
    private String descriçãoplataforma;

    // Construtor Vazio
    public Plataformas(){

    }

    // Construtor padrão
    public Plataformas( String nomeplataforma){
        this.nomeplataforma = nomeplataforma;
    }

    // Construtor Sobrecarregado
    public Plataformas( String nomeplataforma, String resoluçãovideo, String sistemaperacionalcompativel, String quanlidadevideo, String descriçãoplataforma){
        this.nomeplataforma = nomeplataforma;
        this.resoluçãovideo = resoluçãovideo;
        this.sistemaperacionalcompativel = sistemaperacionalcompativel;
        this.quanlidadevideo = quanlidadevideo;
        this.descriçãoplataforma = descriçãoplataforma;
    }


    public void setNomePlataforma( String nomeplataforma ){
        this.nomeplataforma = nomeplataforma;
    }

    public String getNomePlataforma(){
        return this.nomeplataforma;
    }

    public void setResoluçãodeVideo( String resoluçãovideo ){
        this.resoluçãovideo = resoluçãovideo;
    }

    public String getResoluçãodeVideo(){
        return this.resoluçãovideo;
    }

    public void setSistemaOperacionalCompativel( String sistemaperacionalcompativel){
        this.sistemaperacionalcompativel = sistemaperacionalcompativel;
    }

    public String getSistemaOperacionalCompativel(){
        return this.sistemaperacionalcompativel;
    }

    public void setQualidadeVideo( String quanlidadevideo){
        this.quanlidadevideo = quanlidadevideo;
    }

    public String getQualidadeVideo(){
        return this.quanlidadevideo;
    }

    public void setDescriçãodaPlataforma( String descriçãoplataforma ){
        this.descriçãoplataforma = descriçãoplataforma;
    }

    public String getDescriçãodaPlataforma(){
        return this.descriçãoplataforma;
    }
}