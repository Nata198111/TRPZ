package src.strategy;

import src.models.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class TxtSaveStrategy implements SaveStrategy {
    @Override
    public void save(File file, String path) {
        try {
            Files.writeString(Paths.get(path + file.getFileName() + ".txt"), file.getContent(), StandardCharsets.UTF_8);
            System.out.println("File saved as TXT: " + file.getFileName());
        } catch (Exception e) {
            System.err.println("Error saving file as TXT: " + e.getMessage());
        }
    }
}
