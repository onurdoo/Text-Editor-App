package CommandPattern;

import Editor.Belge;
import java.io.IOException;

public class BelgeOlusturCommand implements Command {
    Belge belge;
    String adres;

    public BelgeOlusturCommand(Belge islemi_uygulanicak_belge, String adres) {
        belge = islemi_uygulanicak_belge;
        this.adres = adres;
    }

    @Override
    public void calistir() {
        try {
            belge.belgeOlustur(adres);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
