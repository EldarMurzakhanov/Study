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
        String phrase = userInput.nextLine();

        // 4) Выводим сохранённую фразу.
        System.out.println("Вы ввели: " + phrase);

        // 5) Инициализируем переменные, в которые будем сохранять согласные и гласные буквы.
        int consonantsAmount = 0;
        int vowelsAmount = 0;

        // 6) Объявляем hashmap.
        HashMap<Character, Byte> lettersMap = new HashMap<>();

        // 7) Заполняем hashmap дынными
        lettersMap.put('а', (byte) 1);
        lettersMap.put('б', (byte)  0);
        lettersMap.put('в', (byte)  0);
        lettersMap.put('г', (byte)  0);
        lettersMap.put('д', (byte)  0);
        lettersMap.put('е', (byte)  1);
        lettersMap.put('ё', (byte)  1);
        lettersMap.put('ж', (byte)  0);
        lettersMap.put('з', (byte)  0);
        lettersMap.put('и', (byte)  1);
        lettersMap.put('й', (byte)  0);
        lettersMap.put('к', (byte)  0);
        lettersMap.put('л', (byte)  0);
        lettersMap.put('м', (byte)  0);
        lettersMap.put('н', (byte)  0);
        lettersMap.put('о', (byte)  1);
        lettersMap.put('п', (byte)  0);
        lettersMap.put('р', (byte)  0);
        lettersMap.put('с', (byte)  0);
        lettersMap.put('т', (byte)  0);
        lettersMap.put('у', (byte)  1);
        lettersMap.put('ф', (byte)  0);
        lettersMap.put('х', (byte)  0);
        lettersMap.put('ц', (byte)  0);
        lettersMap.put('ч', (byte)  0);
        lettersMap.put('ш', (byte)  0);
        lettersMap.put('щ', (byte)  0);
        lettersMap.put('э', (byte)  1);
        lettersMap.put('ю', (byte)  1);
        lettersMap.put('я', (byte)  1);

        // 8) Запускаем цикл, которые будут ходить по массиву, и извелкать нужные значения, ориентируясь на ключи в мапе.
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            if (lettersMap.containsKey(letter)) {
                byte value = lettersMap.get(letter);
                if (value == 1) {
                    vowelsAmount++;
                } else if (value == 0) {
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
        String phraseRefined = phrase.toLowerCase().replaceAll("\\s", "");
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
