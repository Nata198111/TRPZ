package commands;

import models.File;
import repositories.FileRepository;
import strategy.SaveStrategy;

public class SaveFileCommand implements Command {
    private final FileRepository repository;
    private final File file;
    private final SaveStrategy strategy; // Оголошення змінної strategy
    private final String path;

    public SaveFileCommand(FileRepository repository, File file, SaveStrategy strategy, String path) {
        this.repository = repository;
        this.file = file;
        this.strategy = strategy;
        this.path = path;
    }

    @Override
    public void execute() {
        strategy.save(file, path);
        repository.save(file);
        System.out.println("File saved: " + file.getFileName());
    }

    @Override
    public void undo() {
        repository.delete(file.getId());
        System.out.println("Undo save: " + file.getFileName());
    }
}
