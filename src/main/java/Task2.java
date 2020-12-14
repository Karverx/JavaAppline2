import java.util.Scanner;

/**
 * Выводим сумму двух дробных чисел, которые пользователь вводит в консоль
 * @author Артем Малийчик
 */

public class Task2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        // Вводим в консоль первое дробное число
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number");
        // Вводим в консоль второе дробное число
        double num2 = sc.nextDouble();
        sc.close();

        // получаем сумму двух дробных чисел
        double result = num1 + num2;

        // Выводим сумму, округленную до 4х знаков после запятой
        System.out.printf("Sum is: %.4f" , result);

    }
}
