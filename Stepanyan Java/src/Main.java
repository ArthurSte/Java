import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1");

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        Calculations calculations = new Calculations(firstNumber, secondNumber);
        calculations.Comparison();

        System.out.println("Сложение:");
        System.out.println(calculations.add());

        System.out.println("Вычитание:");
        System.out.println(calculations.sub());

        System.out.println("Произведение:");
        System.out.println(calculations.prod());

        System.out.println("Деление:");
        System.out.println(calculations.div());

        scanner.nextLine();

        System.out.println("Задание 2");

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        StringCompare stringCompare = new StringCompare(firstString, secondString);
        stringCompare.compareStrings();

        System.out.println("Задание 3");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        EvenPrint evenPrint = new EvenPrint();
        evenPrint.printEvenNumbers(numbers);

    }
}