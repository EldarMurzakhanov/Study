package LearningCurve;

import java.util.Scanner;

public class AllEvenNumbersWithWhile {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = getValidInput(scanner);
        System.out.println("Ваше число " + value);
        int i = 0;

        if (value >= 0) {
            while(i <= value) {
                System.out.println("Чётное число " + i);
                i = i + 2;
            }
        } else {
            while(i >= value) {
                System.out.println("Чётное число " + i);
                i = i - 2;
            }
        }
    }

    private static int getValidInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Попробуйте в этот раз ввести число");
        }
        return scanner.nextInt();
    }
}

