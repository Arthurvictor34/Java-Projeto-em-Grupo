public class MainApp{

    public static void main( String [] args ){
        Usuario us1 = new Usuario();
        us1.setnomeUsuario (" Silvo ");
        us1.setEmailUsuario ("SilvioPadeiro@gmail.com");
        us1.setSenhaUsuario (" Silvio1234");
        us1.setIdadeUsuario(12);
        us1.setCelular ( " 78 91234-5678");
        
        Conteudo co1 = new Conteudo();
        co1.setTitulo ("Harry potter");
        co1.setGenero ("Fantasia");
        co1.setClassificacaoIndicada (12);
        co1.setIdioma (" Portugues Brasil ");
        co1.setLegenda (" Portugues (Brasil) ");

        Plataformas pl1 = new Plataformas();
        pl1.setNomePlataforma ("Nome da plataforma ");
        pl1.setResoluçãodeVideo (" 1920 x 1080 ");
        pl1.setSistemaOperacionalCompativel (" Computadores, Celulares, Notebooks e VideoGames");
        pl1.setQualidadeVideo ( " 1080p ");
        pl1.setDescriçãodaPlataforma (" A descrição da plataforma.");

        Assinatura as1 = new Assinatura();
        as1.setConteudoAdicional(" null ");
        as1.setDescriçãoDaAssinatura("null");
        as1.setNomeDaAssinatura("Premium");
        as1.setPreçoDaAssinatura(59.90);
        as1.setqtDeTelasSimultanea(4);
       
        
    }
}