package HW28122021;

/*
Задача 3.
Создать многомерный массив размерностью n на m. n и m ввести с клавиатуры.
Заполнить массив использую Math.random() случайными числами от 1 до 100.
Вывести массив на консоль.
Найти среднее арифметическое элементов массива и максимальный эллемент массива и вывести их на консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                sum += array[i][j];
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.printf("Average: %s \n", (sum / (array[0].length * array.length)));
        System.out.printf("Max value: %s", max);
    }
}
