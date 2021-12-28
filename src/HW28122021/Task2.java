package HW28122021;

/*
Задача 2.
Создать квадратный массив целых чисел размерностью n на n. n ввести с клавиатуры.
Заполнить его любыми целыми числами. Вывести массив на консоль.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
