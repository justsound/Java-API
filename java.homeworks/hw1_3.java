// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class hw1_3 {
    public static void main(String[] args) {
        Calculate();
    }

    public static void Calculate() {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        double result = 0;
        char operator;

        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        scanner.close();

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = (double) number1 / (double)number2;
                break;
            default:
                System.out.println("Неправильный оператор");
                break;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
