package LearningCurve;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ArithmeticOperations {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##"); // Один знак после запятой
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number = getValidInput(scanner);
        System.out.println("Ваше первое число " + df.format(number));

        System.out.println("Введите второе число");
        double numberSecond = getValidInput(scanner);
        System.out.println("Ваше второе число " + df.format(numberSecond));

        double sum = number + numberSecond;
        System.out.println("Сумма чисел " + df.format(sum));

        double dis = numberSecond - number;
        System.out.println("Разница чисел " + df.format(dis));

        double prod = number * numberSecond;
        System.out.println("Произведение чисел " + df.format(prod));

        if (numberSecond == 0) {
            System.out.println("Деление на 0 невозможно");
        } else {
            double quot = number/numberSecond;
            System.out.println("Частное чисел " + df.format(quot));
        }
    }

    private static double getValidInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Попробуйте в этот раз ввести число");
        }
        return scanner.nextDouble();
    }
}
