package calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        char operation = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите первое число");
            a = sc.nextDouble();

            System.out.println("Введите второе число");
            b = sc.nextDouble();

            System.out.println("Введите операцию ('+' Сложение, '-' Вычитание, '/' Деление, '*' Умножение)");
            operation = sc.next().charAt(0);
        } catch (InputMismatchException e){
            throw new InputMismatchException("Ошибка при вводе числа");
        }

        Calculator calc1 = new Calculator();
        double result = calc1.calc(a, b, operation);
        System.out.printf("Result is: %.4f", result);
    }
}
