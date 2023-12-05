import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

/**
 * Робота з колекцією.
 */
public class Main {

    /**
     * Основний метод для виконання програми.
     *
     * @param args Кількість чисел.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введіть кількість цілих чисел: ");
        int n = scanner.nextInt();

        /**
         * Заповнення колекції числами.
         */
        if (n != 0) {
            System.out.println("Введіть " + n + " чисел:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                numbers.add(num);
            }
        } else {
            /**
             * Генерація 10 випадкових чисел від -100 до 100.
             */
            Random random = new Random();
            System.out.println("Додаю 10 випадкових чисел від -100 до 100:");
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(201) - 100; // від -100 до 100
                numbers.add(randomNum);
            }
        }

        /**
         * Відображення колекції.
         */
        System.out.println("Колекція чисел: " + numbers);

        /**
         * Сортування за зростанням та відображення.
         */
        Collections.sort(numbers);
        System.out.println("Відсортовано за зростанням: " + numbers);

        /**
         * Сортування за спаданням та відображення.
         */
        Collections.reverse(numbers);
        System.out.println("Відсортовано за спаданням: " + numbers);

        /**
         * Знаходження мінімуму та максимуму.
         */
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
    }
}