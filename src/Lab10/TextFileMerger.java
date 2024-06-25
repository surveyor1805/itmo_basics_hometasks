package Lab10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static Lab10.StringListGetter.getStringList;
import static Lab10.StringWriter.putStringIntoFile;

public class TextFileMerger {
    public static void mergeTextFiles(String firstFilePath, String secondFilePath, String combinedFile) {
        Path resultPath = Path.of(combinedFile);
        if (!Files.exists(resultPath)) {
            try {
                Files.createFile(resultPath);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println("Создание файла " + combinedFile + " завершено.");
            }
        }
        List<String> txtFile1strings = getStringList(firstFilePath);
        List<String> txtFile2strings = getStringList(secondFilePath);
        for (String string : txtFile1strings) {
            putStringIntoFile(combinedFile, string);
        }
        putStringIntoFile(combinedFile, "");
        for (String string : txtFile2strings) {
            putStringIntoFile(combinedFile, string);
        }
    }
}
