package HW25122021;

import java.util.Random;
import java.util.Scanner;

/*
Задача 1.
Заполнените массив целыми случайными числами из диапазона от 0 до 300 включительно.
Выведите на экран среднего арифметического элементов массива.
 */

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(300);
        }
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum / arrayLength);
    }
}
