package strategy;

import models.File;

public interface SaveStrategy {
    void save(File file, String path);
}
