package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = sc.nextDouble();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
        System.out.println("Введите операцию ('+' Сложение, '-' Вычитание, '/' Деление, '*' Умножение)");
        char operation = sc.next().charAt(0);

        Calculator calc1 = new Calculator(a, b, operation);
        double result = calc1.calc();
        System.out.printf("Result is: %.4f" , result);

    }
}
