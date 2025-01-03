package strategy;

import com.google.gson.Gson;
import models.File;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonSaveStrategy implements SaveStrategy {
    private static final Gson gson = new Gson();

    @Override
    public void save(File file, String path) {
        try {
            String jsonContent = gson.toJson(file); // Конвертація об'єкта у JSON
            Files.writeString(Paths.get(path + file.getFileName() + ".json"), jsonContent);
            System.out.println("File saved as JSON: " + file.getFileName());
        } catch (Exception e) {
            System.err.println("Error saving file as JSON: " + e.getMessage());
        }
    }
}
