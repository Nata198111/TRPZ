package commands;

import repositories.FileRepository;

public class DeleteFileCommand implements Command {
    private final FileRepository repository;
    private final Long fileId;

    public DeleteFileCommand(FileRepository repository, Long fileId) {
        this.repository = repository;
        this.fileId = fileId;
    }

    @Override
    public void execute() {
        repository.delete(fileId);
        System.out.println("File deleted: " + fileId);
    }

    @Override
    public void undo() {
        System.out.println("Undo not implemented for delete operation.");
    }
}
