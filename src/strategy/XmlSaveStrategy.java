package src.strategy;

import src.models.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlSaveStrategy implements SaveStrategy {
    @Override
    public void save(File file, String path) {
        try {
            String xmlContent = "<file>\n" +
                    "   <id>" + file.getId() + "</id>\n" +
                    "   <name>" + file.getFileName() + "</name>\n" +
                    "   <content>" + file.getContent() + "</content>\n" +
                    "</file>";
            Files.writeString(Paths.get(path + file.getFileName() + ".xml"), xmlContent);
            System.out.println("File saved as XML: " + file.getFileName());
        } catch (Exception e) {
            System.err.println("Error saving file as XML: " + e.getMessage());
        }
    }
}
