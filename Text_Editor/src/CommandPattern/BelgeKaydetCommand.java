package CommandPattern;

import Editor.Belge;
import ObserverPattern.LoggingListener;

import java.io.IOException;

public class BelgeKaydetCommand implements Command{
    Belge belge;
    String adres;

    public BelgeKaydetCommand(Belge islemi_uygulanicak_belge, String adres) {
        belge = islemi_uygulanicak_belge;
        this.adres = adres;
    }

    @Override
    public void calistir() {
        try {
            belge.belgeKaydet(adres);
            LoggingListener logger = new LoggingListener(
                    "$adres/log.txt",
                    "Someone has opened the file: %s");
            belge.events.subscribe("open", logger);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
