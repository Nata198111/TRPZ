import models.File;
import repositories.FileRepository;
import template.FileProcessor;
import template.JsonFileProcessor;
import template.TxtFileProcessor;
import template.XmlFileProcessor;
import observer.LogObserver;
import observer.UIObserver;

public class Main {
    public static void main(String[] args) {
        // Ініціалізація репозиторію для файлів
        FileRepository fileRepository = new FileRepository();

        // Створення та додавання підписників
        LogObserver logObserver = new LogObserver();
        UIObserver uiObserver = new UIObserver();
        fileRepository.attach(logObserver);
        fileRepository.attach(uiObserver);

        // Створення прикладового файлу
        File file = new File();
        file.setId(1L);
        file.setFileName("example");
        file.setContent("This is a sample content.");

        // Обробка файлу з використанням шаблону "Template Method"
        System.out.println("Processing file as TXT...");
        FileProcessor txtProcessor = new TxtFileProcessor();
        txtProcessor.processFile(file, "./");

        System.out.println("Processing file as JSON...");
        FileProcessor jsonProcessor = new JsonFileProcessor();
        jsonProcessor.processFile(file, "./");

        System.out.println("Processing file as XML...");
        FileProcessor xmlProcessor = new XmlFileProcessor();
        xmlProcessor.processFile(file, "./");
    }
}
