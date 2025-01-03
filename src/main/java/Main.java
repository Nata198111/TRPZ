import models.File;
import repositories.FileRepository;
import strategy.JsonSaveStrategy;
import strategy.TxtSaveStrategy;
import strategy.XmlSaveStrategy;
import commands.CommandInvoker;
import commands.SaveFileCommand;
import commands.Command;

public class Main {
    public static void main(String[] args) {
        // Ініціалізація репозиторію для файлів
        FileRepository fileRepository = new FileRepository();

        // Створення прикладового файлу
        File file = new File();
        file.setId(1L);
        file.setFileName("example");
        file.setContent("This is a sample content.");

        // Ініціалізація Invoker
        CommandInvoker invoker = new CommandInvoker();

        Command saveCommand = new SaveFileCommand(fileRepository, file, new TxtSaveStrategy(), "./");
        invoker.executeCommand(saveCommand);

        // Виконання команд через патерн "Команда"
        System.out.println("Saving file as TXT...");
        SaveFileCommand saveAsTxt = new SaveFileCommand(fileRepository, file, new TxtSaveStrategy(), "./");
        invoker.executeCommand(saveAsTxt);

        System.out.println("Saving file as JSON...");
        SaveFileCommand saveAsJson = new SaveFileCommand(fileRepository, file, new JsonSaveStrategy(), "./");
        invoker.executeCommand(saveAsJson);

        System.out.println("Saving file as XML...");
        SaveFileCommand saveAsXml = new SaveFileCommand(fileRepository, file, new XmlSaveStrategy(), "./");
        invoker.executeCommand(saveAsXml);

        // Опціонально: Undo останньої команди
        System.out.println("Undoing last command...");
        invoker.undoLastCommand();
    }
}

