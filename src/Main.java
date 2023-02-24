import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {

        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        System.out.println("Задача 2");

        int[] arr2 = generateRandomArray();
        int min = arr2[0];
        int max = arr2.length;
        for (int i2 = 0; i2 < arr2.length; i2++) {
            if (min >= arr2[i2]) {
                min = arr2[i2];
            }
            if (max <= arr2[i2]) {
                max = arr2[i2];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");


        System.out.println("Задача 3");

        int[] arr3 = generateRandomArray();
        double sum3 = 0;
        for (int days : arr3) {
            sum3 += days;
        }
        double averageAmount = sum3 / arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");


        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i4 = reverseFullName.length - 1; i4 >= 0; i4--) {
            System.out.print(reverseFullName[i4]);
        }
    }
}