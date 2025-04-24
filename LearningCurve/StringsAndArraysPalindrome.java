package LearningCurve;

import java.util.Scanner;

public class StringsAndArraysPalindrome {

    public static void main (String[] args) {
        // 1) Инициализируем сканнер.
        Scanner userInput = new Scanner(System.in);

        // 2) Просим пользователя ввести фразу
        System.out.println("Введите фразу.");

        // 3) Заворачиваем введённое значение в стрингу и сохраняем. Приводим стрингу к виду нижнего регистра.

        String phrase = userInput.nextLine();
        String phraseRefined = phrase.toLowerCase().replaceAll("\\s", "");

        // 4) Выводим сохранённую фразу.
        System.out.println("Вы ввели: " + phrase);

        // 5) Инициализируем переменные, в которые будем сохранять согласные и гласные буквы.
        int consonantsAmount = 0;
        int vowelsAmount = 0;

        // 7) Объявляем переменную, в которой будет массив согласных букв. Для char нужно использовать
        // одинарные ковычки.
        char[] consonants = {
                'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'
        };

        // 8) Объявляем переменную, в которой будем массив гласных.
        char[] vowels = {
                'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'ю', 'я'
        };

        // 8) Запускаем циклы, которые будут ходить по массиву, вытаскивать согласные и гласные буквы и сохранять их в
        // переменные.
        for (int i = 0; i < phraseRefined.length(); i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (phraseRefined.charAt(i) == consonants[j]) {
                    consonantsAmount ++;
                }
            }
        }

        for (int i = 0; i < phraseRefined.length(); i++) {
            for (int j = 0; j < vowels.length; j ++) {
                if (phraseRefined.charAt(i) == vowels[j]) {
                    vowelsAmount ++;
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

        if (isPalindrome == true) {
            System.out.println("Ваша строка палиндром");
        }
    }
}
