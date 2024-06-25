package Lab10;

import java.util.List;

import static Lab10.StringListGetter.getStringList;
import static Lab10.StringWriter.putStringIntoFile;
import static Lab10.TextFileMerger.mergeTextFiles;
import static Lab10.TextReplacer.replaceWithSymbols;

public class Main {
    public static void main(String[] args) {
        //point 1
        String testPath = "files/SomeFile.txt";
        List<String> txtFileStrings = getStringList(testPath);
        //point 2
        putStringIntoFile(testPath, "!!! НОВАЯ СТРОКА !!!");
        //point 3
        String fileToMerge1 = "files/fileToMerge1.txt";
        String fileToMerge2 = "files/fileToMerge2.txt";
        String saveToFile = "files/fileTotal.txt";
        mergeTextFiles(fileToMerge1, fileToMerge2, saveToFile);
        //point 4
        String textForReplace = "files/replaceTest.txt";
        replaceWithSymbols(textForReplace);
    }
}
