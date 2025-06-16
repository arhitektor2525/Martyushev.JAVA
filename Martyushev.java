import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Сравнение и операции с числами
        System.out.println("Задача 1: Введите два целых числа (a и b):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / (double) b));

        // Задача 2: Сравнение строк
        System.out.println("\nЗадача 2: Введите две строки (a и b):");
        scanner.nextLine(); // Очистка буфера
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Задача 3: Четные числа в массиве
        System.out.println("\nЗадача 3: Четные числа из массива [1, 2, ..., 10]:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
