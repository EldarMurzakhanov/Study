package LearningCurve;

import java.util.Scanner;

public class AllEvenNumbersWithIf {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = getValidInput(scanner);
        System.out.println("Ваше число " + value);

        if (value >= 0) {
            for (int i = 0; i <= value; i += 2) {
                System.out.println("Чётное число " + i);
            }
        } else {
            for (int i = 0; i >= value; i = i - 2) {
                System.out.println("Четное число " + i);
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