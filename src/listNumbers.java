import java.util.*;
import java.util.stream.IntStream;

/**
 * Задание
 * Пусть дан произвольный список целых чисел.
 * <p>
 * 1) Найти максимальное значение
 * 2) Найти минимальное значение
 * 3) Найти среднее значение
 * 4) Нужно удалить из него чётные числа
 */

public class listNumbers {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Enter array dimension: ");
            int size = iScanner.nextInt();
            System.out.print("Enter upper bound of random numbers: ");
            int upperBound = iScanner.nextInt();  // Верхняя граница рандомных чиселдо 100

            List<Integer> list = new ArrayList<>(size);  // Создаем массив с заданной размерностью

            Random random = new Random(); // Создаем объект для генерирования рандомных чисел

            IntStream.range(0, size)   // С помощью стрима проходим по всему массиву
                    .forEach(index -> list.add(random.nextInt(upperBound + 1)));

            System.out.println(list);
            System.out.println("Maximum List Value: " + Collections.max(list)); // Max value of list.
            System.out.println("Minimum List Value: " + Collections.min(list)); // Min value of list.

            // Average value of list.
            int sum = 0;
            double average = 0;
            for (int num : list) {
                sum += num;

                average = (double) sum / list.size();
            }

            System.out.println("Average Value: " + average);
            // создаем итератор
            // до тех пор, пока в списке есть элементы
            list.removeIf(ArrayList -> ArrayList % 2 == 0);
            System.out.println("Removed even numbers: " + Arrays.toString(list.toArray()));
        }
    }
}
