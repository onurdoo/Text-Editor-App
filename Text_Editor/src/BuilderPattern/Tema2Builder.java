package BuilderPattern;

import java.awt.*;

public class Tema2Builder extends TemaBuilder {
    @Override
    public void temaAdiKur() {
        tema.setTemaAdi("Tema2");
    }

    @Override
    public void fontKur() {
        tema.setFont("Arial Black");
    }

    @Override
    public void renkKur() {
        tema.setRenk(Color.GRAY);

    }
    @Override
    public void textRenkKur() {
        tema.setTextRenk(Color.BLUE);
    }

    @Override
    public void textBoyutuKur() {
        tema.setTextBoyutu(14);
    }
}
