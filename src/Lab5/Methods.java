package Lab5;

public class Methods {
    //Метод для поиска самого длинного слова в тексте
    public static String longWordFind(String fish) {
        String[] res = fish.split("[\\s-,.\"]+");
        int wordLength = 0;
        String longestWord = null;
        for (String string : res) {
            char[] chars = string.toCharArray();
            if (chars.length > wordLength) {
                wordLength = chars.length;
                longestWord = new String(chars);
            }
        }
        return longestWord;
    }

    //Метод для проверки является ли слово палиндромом
    public static boolean palindromeCheck(String palindrome) {
        String sameWordCaseIgnore = palindrome.toLowerCase();
        char[] chars = sameWordCaseIgnore.toCharArray();
        char[] charsReversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsReversed[chars.length - 1 - i] = chars[i];
        }
        String wordReversed = new String(charsReversed);
        return sameWordCaseIgnore.equals(wordReversed);
    }

    //Метод для подсчета вхождений подстроки
    public static int countSubstringInString(String substringTest, String fish) {
        int counter = 0;
        String[] text = fish.split("[\\s-,.\"]+");
        for (String string : text) {
            if (string.equalsIgnoreCase(substringTest)) {
                counter++;
            }
        }
        return counter;
    }

    //Метод для инвертирования слов в строке
    public static String reverseText(String text2) {
        String[] text = text2.split("\\s");
        String[] textReversed = new String[text.length];
        StringBuilder totalTextReversed = new StringBuilder();
        int k = 0;
        for (String string : text) {
            char[] chars = string.toCharArray();
            char[] charsReversed = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                charsReversed[chars.length - 1 - i] = chars[i];
            }
            textReversed[k] = new String(charsReversed);
            totalTextReversed.append(textReversed[k]).append(" ");
            k++;
        }
        return totalTextReversed.toString().trim();
    }

    //Метод для цензуры выбранного текста
    public static String textCensore(String toCensore, String fish2) {
        String[] text = fish2.split("\\s");
        StringBuilder textFinal = new StringBuilder();
        for (String string : text) {
            if (string.equalsIgnoreCase(toCensore)) {
                textFinal.append("[вырезано цензурой]").append(" ");
                continue;
            }
            textFinal.append(string).append(" ");
        }
        return textFinal.toString().trim();
    }
}
