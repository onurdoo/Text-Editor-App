package BuilderPattern;

public abstract class TemaBuilder {
    protected Tema tema;

    public Tema getTheme() {
        return tema;
    }

    public void temaYap() {
        tema = new Tema();
    }

    public Tema temaAl(){
        return tema;
    }

    public abstract void temaAdiKur();

    public abstract void fontKur();

    public abstract void renkKur();

    public abstract void textRenkKur();

    public abstract void textBoyutuKur();

}
