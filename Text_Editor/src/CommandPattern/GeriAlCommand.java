package CommandPattern;

import Editor.Belge;

public class GeriAlCommand implements Command {
    Belge belge;

    public GeriAlCommand(Belge islemi_uygulanicak_belge) {
        belge = islemi_uygulanicak_belge;
    }

    @Override
    public void calistir() {
        belge.geriAlma();
    }
}
