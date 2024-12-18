package src.strategy;

import src.models.File;

public interface SaveStrategy {
    void save(File file, String path);
}
