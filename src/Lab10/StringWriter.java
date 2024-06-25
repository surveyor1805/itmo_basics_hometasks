package Lab10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StringWriter {
    public static void putStringIntoFile(String filePath, String newString) {
        File file = new File(filePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write(newString);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void reWrite(String filePath, List<String> newStrings) {
        File file = new File(filePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (String string : newStrings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
