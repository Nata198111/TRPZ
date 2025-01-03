package template;

import models.File;
import strategy.TxtSaveStrategy;

public class TxtFileProcessor extends FileProcessor {
    private TxtSaveStrategy saveStrategy = new TxtSaveStrategy();

    @Override
    protected void saveFile(File file, String path) {
        saveStrategy.save(file, path);
    }
}
