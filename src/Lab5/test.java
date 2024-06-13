package Lab5;

public class test {
    public static void main(String[] args) {
        //point 1
        String fish = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";
        String longestWord = Methods.longWordFind(fish);
        System.out.println("Самое длинное слово в тексте: " + longestWord);

        //point 2
        String palindrome = "Шалаш";
        boolean answer = Methods.palindromeCheck(palindrome);
        System.out.println("Введенное слово является палиндромом: " + answer);

        //point 3
        String fish2 = "Бяка бывает разная. Бяка ужасная, бяка страшная, бяка большая и т.д.";
        String textCensored = Methods.textCensore("Бяка", fish2);
        System.out.println(textCensored);

        //point 4
        String substringTest = fish.substring(0, 5);
        System.out.println("Проверяем количество вхождений следующей подстроки: " + substringTest);
        int counter = Methods.countSubstringInString(substringTest, fish);
        System.out.println("Количество вхождений: " + counter);

        //point 5
        String text2 = "This is a test string";
        String textReversed = Methods.reverseText(text2);
        System.out.println("The given string is: " + text2);
        System.out.println("The string reversed word by word is:\n" + textReversed);
    }
}
