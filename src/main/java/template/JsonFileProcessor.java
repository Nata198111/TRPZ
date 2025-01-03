package template;

import models.File;
import strategy.JsonSaveStrategy;

public class JsonFileProcessor extends FileProcessor {
    private JsonSaveStrategy saveStrategy = new JsonSaveStrategy();

    @Override
    protected void saveFile(File file, String path) {
        saveStrategy.save(file, path);
    }
}

