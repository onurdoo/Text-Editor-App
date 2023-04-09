package BuilderPattern;

public class TemaDirector {
    private TemaBuilder temaBuilder;



    public void setTemaBuilder(TemaBuilder temaBuilder) {
        this.temaBuilder = temaBuilder;
    }

    public Tema temaAl(){
        return temaBuilder.temaAl();
    }

    public void temaKur(){
        temaBuilder.temaYap();
        temaBuilder.temaAdiKur();
        temaBuilder.fontKur();
        temaBuilder.renkKur();
        temaBuilder.textRenkKur();
        temaBuilder.textBoyutuKur();


    }
}
