package template;

import models.File;

public abstract class FileProcessor {
    public final void processFile(File file, String path) {
        readFile(file);
        validateFile(file);
        saveFile(file, path);
        logOperation(file);
    }

    protected void readFile(File file) {
        System.out.println("Reading file: " + file.getFileName());
    }

    protected void validateFile(File file) {
        System.out.println("Validating file: " + file.getFileName());
    }

    protected abstract void saveFile(File file, String path);

    protected void logOperation(File file) {
        System.out.println("Logging operation for file: " + file.getFileName());
    }
}
