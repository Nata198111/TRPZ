package src.utilities;


import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class FileUtils {
    public static String detectEncoding(String path) {
        // For simplicity, returning UTF-8
        return "UTF-8";
    }

    public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
    }

    public static void writeFile(String path, String content) throws IOException {
        Files.writeString(Paths.get(path), content, StandardCharsets.UTF_8);
    }
}
