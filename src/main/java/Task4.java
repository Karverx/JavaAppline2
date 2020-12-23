
import java.util.Arrays;
import java.util.Random;

/**
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 * @author Артем Малийчик
 */

public class Task4 {

    public static void main(String[] args) {
       int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom();
        }

        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(array));

        int maxNeg = -10;
        int minPos = 10;


        //Получаем минимальное положительное и максимальное отрицательное числа
        for (int j : array) {
            if (minPos >= j && j > 0) {
                minPos = j;
            }
            if (maxNeg <= j && j < 0) {
                maxNeg = j;
            }
        }

        System.out.println("Минимальное положительное число = " + minPos);
        System.out.println("Максимальное отрицательно число = " + maxNeg);

        //Меняем местами минимальное положительное и максимальное отрицательное числа
        for (int i = 0; i < array.length; i++) {
            if(array[i] == minPos) {array[i] = maxNeg; continue;}
            if(array[i] == maxNeg) {array[i] = minPos;}
        }

        System.out.println("Изменный массив:");
        System.out.println(Arrays.toString(array));

    }

    //Метод генерирует случайное число в диапазоне от -10 до 10
    static int getRandom(){
        int min = -10;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
