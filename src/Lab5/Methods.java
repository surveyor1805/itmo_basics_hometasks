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
        StringBuilder stringBuilder = new StringBuilder(palindrome);
        String textReversed = stringBuilder.reverse().toString();
        return textReversed.equalsIgnoreCase(palindrome);
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
        StringBuilder reversedWordsInText = new StringBuilder();
        for (String string : text) {
            StringBuilder word = new StringBuilder(string);
            reversedWordsInText.append(word.reverse()).append(" ");
        }
        return reversedWordsInText.toString().trim();
    }

    //Метод для цензуры выбранного текста
    public static String textCensore(String toCensore, String howCensore, String fish2) {
        String[] text = fish2.split("\\s");
        StringBuilder textFinal = new StringBuilder();
        for (String string : text) {
            if (string.equalsIgnoreCase(toCensore)) {
                textFinal.append(howCensore).append(" ");
                continue;
            }
            textFinal.append(string).append(" ");
        }
        return textFinal.toString().trim();
    }
}
