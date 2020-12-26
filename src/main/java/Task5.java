import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Task5 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("test1.txt")))
        {
            while((s = reader.readLine()) != null){
                //Разбиваем строку на слова
                String [] words = s.split(" ");
                for (String word: words) {
                    if(!map.containsKey(word)){
                        map.put(word, 1);
                    } else{
                    map.put(word, map.get(word)+1);
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        System.out.println("Результат подсчета повторений слов:");

        // Выводим на экран все слова в алфавитном порядке
        // Находим слово с максимальным количество повторений
        String maxKey = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(maxCount < pair.getValue()){
                maxCount = pair.getValue();
                maxKey = pair.getKey();
            }
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
        System.out.println("Слово с максимальным количеством повторений: " + maxKey + " " + map.get(maxKey));
    }
}