package src.main;

import src.context.SaveContext;
import src.models.File;
import src.strategy.JsonSaveStrategy;
import src.strategy.TxtSaveStrategy;
import src.strategy.XmlSaveStrategy;

public class Main {
    public static void main(String[] args) {
        // Створення прикладового файлу
        File file = new File();
        file.setId(1L);
        file.setFileName("example");
        file.setContent("This is a sample content.");

        // Контекст для збереження файлу
        SaveContext saveContext = new SaveContext();

        // Вибір стратегії збереження
        System.out.println("Saving file as TXT...");
        saveContext.setStrategy(new TxtSaveStrategy());
        saveContext.executeSave(file, "./");

        System.out.println("Saving file as JSON...");
        saveContext.setStrategy(new JsonSaveStrategy());
        saveContext.executeSave(file, "./");

        System.out.println("Saving file as XML...");
        saveContext.setStrategy(new XmlSaveStrategy());
        saveContext.executeSave(file, "./");
    }
}
