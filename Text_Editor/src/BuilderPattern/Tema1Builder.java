package BuilderPattern;

import java.awt.*;

public class Tema1Builder extends TemaBuilder{
    @Override
    public void temaAdiKur() {
        tema.setTemaAdi("Tema1");
    }

    @Override
    public void fontKur() {
        tema.setFont("Times New Roman");
    }

    @Override
    public void renkKur() {
        tema.setRenk(Color.WHITE);

    }

    @Override
    public void textRenkKur() {
        tema.setTextRenk(Color.BLACK);
    }

    @Override
    public void textBoyutuKur() {
        tema.setTextBoyutu(12);
    }
}
