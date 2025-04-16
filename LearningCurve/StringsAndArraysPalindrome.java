package LearningCurve;

import java.util.Arrays;
import java.util.Scanner;


public class StringsAndArraysPalindrome {

    public static void main (String[] args) {

//        String phrase = new String();
//        phrase = "Это новая фраза";
//
//        char[] charArrayInPhrase = phrase.toCharArray();
//
//        System.out.println(Arrays.toString(charArrayInPhrase));

        // 1) Инициализируем сканнер.
        Scanner userInput = new Scanner(System.in);

        // 2) Просим пользователя ввести фразу
        System.out.println("Введите фразу.");

        // 3) Заворачиваем введённое значение в стрингу и сохраняем.
        String userInputPhrase = userInput.nextLine();

        // 4) Выводим сохранённую фразу.
        System.out.println("Вы ввели: " + userInputPhrase);

        // 5) Инициализируем переменные, в которые будем сохранять согласные и гласные буквы.
        int consonantsAmount = 0;
        int vowelsAmount = 0;

        // 7) Объявляем переменную, в которой будет массив согласных букв. Для char нужно использовать
        // одинарные ковычки.
        char[] consonants = {
                'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
        };

        // 8) Объявляем переменную, в которой будем массив беззвучных букв.
        char[] silentLetters = {
                'ъ', 'ь'
        };

        // 8) Запускаем цикл, который будет ходить по массиву, вытаскивать согласные буквы, сохранять их в переменную,
        // остальные символу будут сохраняться в переменную гласных.
        for (int i = 0; i < userInputPhrase.length(); i++) {
            for (int j = 0; j < consonants.length; j++) {
                for (int l = 0; l < silentLetters.length; l++) {
                    if (userInputPhrase.charAt(i) != silentLetters[l]) {
                        if (userInputPhrase.charAt(i) == consonants[j]) {
                            consonantsAmount ++;
                        } else {
                            vowelsAmount ++;
                        }
                    }
                }
            }
        }
        System.out.println("Количество согласных: " + consonantsAmount);
        System.out.println("Количество гласных: " + vowelsAmount);
    }
}
