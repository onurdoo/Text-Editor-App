package CommandPattern;

import Editor.Belge;
import java.io.IOException;

public class BelgeAcCommand implements Command{
    Belge belge;
    String adres;

    public BelgeAcCommand(Belge islemi_uygulanicak_belge, String adres) {
        belge = islemi_uygulanicak_belge;
        this.adres = adres;
    }

    @Override
    public void calistir() {
        try {

            belge.belgeAc(adres);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
