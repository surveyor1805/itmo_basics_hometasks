package Lab10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static Lab10.StringWriter.reWrite;

public class TextReplacer {
    public static void replaceWithSymbols(String path) {
        List<String> strings = new ArrayList<>();
        List<String> newStrings = new ArrayList<>();
        try {
            Path filePath = Path.of(path);
            strings = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Текстовый файл " + path + " обработан.");
        }
        for (String string : strings) {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!Character.isLetter(chars[i]) && !Character.isDigit(chars[i])) {
                    chars[i] = '$';
                }
            }
            newStrings.add(new String(chars));
        }
        reWrite(path, newStrings);
    }
}
