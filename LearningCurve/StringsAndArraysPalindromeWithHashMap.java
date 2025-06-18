package LearningCurve;

import java.util.HashMap;
import java.util.Scanner;

public class StringsAndArraysPalindromeWithHashMap {

    public static void main (String[] args) {
        // 1) Инициализируем сканнер.
        Scanner userInput = new Scanner(System.in);

        // 2) Просим пользователя ввести фразу
        System.out.println("Введите фразу.");

        // 3) Заворачиваем введённое значение в стрингу и сохраняем.
        String phrase = userInput.nextLine().toLowerCase();

        // 4) Выводим сохранённую фразу.
        System.out.println("Вы ввели: " + phrase);

        // 5) Инициализируем переменные, в которые будем сохранять согласные и гласные буквы.
        int consonantsAmount = 0;
        int vowelsAmount = 0;

        // 6) Объявляем hashmap.
        HashMap<Character, Boolean> lettersMap = new HashMap<>();

        // 7) Строка гласных
        String vowels = "аеёиоуыэюя";

        // 8) Исключаем 'ъ' и 'ь' при добавлении
        for (char c = 'а'; c <= 'я'; c++) {
            if (c != 'ъ' && c != 'ь') {
                lettersMap.put(c, vowels.indexOf(c) != -1);
            }
        }

        // 8) Запускаем цикл, которые будут ходить по массиву, и извелкать нужные значения, ориентируясь на ключи в мапе.
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            if (lettersMap.containsKey(letter)) {
                if (lettersMap.get(letter)) {
                    vowelsAmount++;
                } else {
                    consonantsAmount++;
                }
            }
        }

        // 9) Выводим значение переменных.
        System.out.println("Количество согласных: " + consonantsAmount);
        System.out.println("Количество гласных: " + vowelsAmount);

        // 10) Написать логику проверки палиндрома. Приводим стрингу к виду нижнего регистра. Приводим
        // стрингу к массиву чаров. Уже на опыте, будем использовать цикл, который ходит по половине
        // строки и проверяет, является ли символ в начале строки копией символа в конце строки.
        String phraseRefined = phrase.replaceAll("[^а-яё]", "");
        int len = phraseRefined.length();

        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (phraseRefined.charAt(i) != phraseRefined.charAt(len - 1 - i)) {
                System.out.println("Ваша строка не палиндром");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Ваша строка палиндром");
        }
    }

}
