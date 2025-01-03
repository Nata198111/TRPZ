package context;

import models.File;
import strategy.SaveStrategy;

public class SaveContext {
    private SaveStrategy strategy;

    public void setStrategy(SaveStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSave(File file, String path) {
        if (strategy != null) {
            strategy.save(file, path);
        } else {
            System.err.println("No strategy selected for saving the file.");
        }
    }
}
