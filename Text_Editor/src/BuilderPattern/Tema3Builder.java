package BuilderPattern;

import java.awt.*;

public class Tema3Builder extends TemaBuilder {
    @Override
    public void temaAdiKur() {
        tema.setTemaAdi("Tema3");
    }

    @Override
    public void fontKur() {
        tema.setFont("Comic Sans MS");
    }

    @Override
    public void renkKur() {
        tema.setRenk(Color.RED);

    }

    @Override
    public void textRenkKur() {
        tema.setTextRenk(Color.YELLOW);
    }

    @Override
    public void textBoyutuKur() {
        tema.setTextBoyutu(16);
    }
}
