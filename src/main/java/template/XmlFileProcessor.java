package template;

import models.File;
import strategy.XmlSaveStrategy;

public class XmlFileProcessor extends FileProcessor {
    private XmlSaveStrategy saveStrategy = new XmlSaveStrategy();

    @Override
    protected void saveFile(File file, String path) {
        saveStrategy.save(file, path);
    }
}

