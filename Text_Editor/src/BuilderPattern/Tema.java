package BuilderPattern;

import java.awt.*;

public class Tema {
    private String temaAdi;
    private String font;
    private Color renk;
    private Color textRenk;

    public Color getTextRenk() {
        return textRenk;
    }

    public void setTextRenk(Color textRenk) {
        this.textRenk = textRenk;
    }

    private int textBoyutu;

    public String getTemaAdi() {
        return temaAdi;
    }

    public String getFont() {
        return font;
    }

    public Color getRenk() {
        return renk;
    }

    public int getTextBoyutu() {
        return textBoyutu;
    }

    public void setTemaAdi(String temaAdi) {
        this.temaAdi = temaAdi;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setRenk(Color renk) {
        this.renk = renk;
    }

    public void setTextBoyutu(int textBoyutu) {
        this.textBoyutu = textBoyutu;
    }
}
