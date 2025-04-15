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
        // 5) Превращаем стрингу в массив char.
        char[] userInputPhraseToCharArray = userInputPhrase.toCharArray();
        // 6) Инициализируем переменную, в которую будем сохранять согласные буквы в массиве.
        int consonantsAmount = 0;
        int vowels = 0;
        // 7) Описываем условие, с которым будем сравнивать, что символ является согласным. Оказывается, для char нужно
        // использовать одинарные ковычки, запомнил.
        char[] consonants = {
                'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
        };
        // 8) Запускаем цикл, который будет ходить по массиву, вытаскивать согласные буквы и сохранять их в переменную.
        //Не получается взять символ из массива. Нужно изучить как строить цикл for-each.
        for (int i = 0; i < userInputPhraseToCharArray.length; i++) {
            if (userInputPhraseToCharArray[i] == consonants) {
                consonantsAmount ++;
            }
        }



    }


}
