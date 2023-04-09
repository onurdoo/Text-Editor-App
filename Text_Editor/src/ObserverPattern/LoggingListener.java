package ObserverPattern;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    public void update(String filename) throws IOException {
        Files.writeString(Paths.get(log.getPath()), message.replace("%s", filename));
    }
}
