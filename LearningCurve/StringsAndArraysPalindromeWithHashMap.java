package LearningCurve;

import java.util.HashMap;
import java.util.Scanner;

public class StringsAndArraysPalindromeWithHashMap {

    public static void main (String[] args) {
        // 1) Инициализируем сканнер.
        Scanner userInput = new Scanner(System.in);

        // 2) Просим пользователя ввести фразу
        System.out.println("Введите фразу.");

        // 3) Заворачиваем введённое значение в стрингу и сохраняем. Приводим стрингу к виду нижнего регистра. Приводим
        // стрингу к массиву чаров.

        String phrase = userInput.nextLine();
        String phraseRefined = phrase.toLowerCase().replaceAll("\\s", "");

        // 4) Выводим сохранённую фразу.
        System.out.println("Вы ввели: " + phrase);

        // 5) Инициализируем переменные, в которые будем сохранять согласные и гласные буквы.
        int consonantsAmount = 0;
        int vowelsAmount = 0;

        // 7) Объявляем hashmap.

        HashMap<Character, String> lettersMap = new HashMap<>();

        // 8) Заполняем hashmap дынными

        lettersMap.put('а', "vowels");
        lettersMap.put('б', "consonants");
        lettersMap.put('в', "consonants");
        lettersMap.put('г', "consonants");
        lettersMap.put('д', "consonants");
        lettersMap.put('е', "vowels");
        lettersMap.put('ё', "vowels");
        lettersMap.put('ж', "consonants");
        lettersMap.put('з', "consonants");
        lettersMap.put('и', "vowels");
        lettersMap.put('й', "consonants");
        lettersMap.put('к', "consonants");
        lettersMap.put('л', "consonants");
        lettersMap.put('м', "consonants");
        lettersMap.put('н', "consonants");
        lettersMap.put('о', "vowels");
        lettersMap.put('п', "consonants");
        lettersMap.put('р', "consonants");
        lettersMap.put('с', "consonants");
        lettersMap.put('т', "consonants");
        lettersMap.put('у', "vowels");
        lettersMap.put('ф', "consonants");
        lettersMap.put('х', "consonants");
        lettersMap.put('ц', "consonants");
        lettersMap.put('ч', "consonants");
        lettersMap.put('ш', "consonants");
        lettersMap.put('щ', "consonants");
        lettersMap.put('э', "vowels");
        lettersMap.put('ю', "vowels");
        lettersMap.put('я', "vowels");

        // 9) Запускаем цикл, которые будут ходить по массиву, и извелкать нужные значения, ориентируясь на ключи в мапе.
        for (int i = 0; i < phraseRefined.length(); i++) {
            if (lettersMap.containsKey(phraseRefined.charAt(i))) {
                if (lettersMap.get(phraseRefined.charAt(i)).equals("vowels")) {
                    vowelsAmount ++;
                }
                if (lettersMap.get(phraseRefined.charAt(i)).equals("consonants")) {
                    consonantsAmount ++;
                }
            }
        }

        // 9) Выводим значение переменных.
        System.out.println("Количество согласных: " + consonantsAmount);
        System.out.println("Количество гласных: " + vowelsAmount);

        // 10) Написать логику проверки палиндрома. Уже на опыте, будем использовать цикл, который ходит по половине
        // строки и проверяет, является ли символ в начале строки копией символа в конце строки.
        boolean isPalindrome = true;

        char[] phraseCharArray = phraseRefined.toCharArray();

        for (int i = 0; i < phraseRefined.length()/2; i++) {
            if (phraseCharArray[i] != phraseCharArray[phraseRefined.length() - 1 - i]) {
                isPalindrome = false;
                System.out.println("Ваша строка не палиндром");
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Ваша строка палиндром");
        }
    }

}
