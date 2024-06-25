package Lab10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringListGetter {
    public static List<String> getStringList(String filePath) {
        try {
            Path path = Path.of(filePath);
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return List.of("");
        } finally {
            System.out.println("Текстовый файл " + filePath + " обработан.");
        }
    }
}
