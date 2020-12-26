import java.util.Scanner;

/**
 * Пишем калькулятор и поиск максимального элемента в массиве строк
 * @author Артем Малийчик
 */
public class Task3 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задачи: (1 - Calculator, 2 - String array)");
        num = sc.nextInt();

        switch (num) {
            case 1 -> {
                System.out.println("Введите первое число");
                double a = sc.nextDouble();
                System.out.println("Введите второе число");
                double b = sc.nextDouble();
                System.out.println("Введите операцию ('+' Сложение, '-' Вычитание, '/' Деление, '*' Умножение)");
                char symbol = sc.next().charAt(0);
                double result = calculator(a, b, symbol);
                System.out.printf("Result is: %.4f" , result);
            }
            case 2 -> {
                System.out.println("Введите размер массива");
                int n = sc.nextInt();
                String[] array = new String[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Введите слово");
                    array[i] = sc.next();
                }
                int max = 0;
                String result = "";
                for (String str : array) {
                    if (max < str.length()) {
                        max = str.length();
                        result = str;
                    }
                }
                System.out.println("Самое длинное слово в массиве: " + result);
            }
            default -> System.out.println("Введен некорректный номер операции");
        }
        sc.close();
    }

    static double calculator(double a, double b, char symbol){
        double result = 0;
        switch (symbol) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> System.out.println("Введен неправильно символ операции");
        }
        return result;
    }
}
