package HW25122021;

/*
Задача 4.
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(-1, 2);
        }
        int minusOneCounter = 0;
        int zeroCounter = 0;
        int oneCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                minusOneCounter++;
            }
            if (arr[i] == 0) {
                zeroCounter++;
            }
            if (arr[i] == 1) {
                oneCounter++;
            }
        }

        boolean comparison = (
                minusOneCounter != zeroCounter &&
                zeroCounter != oneCounter &&
                minusOneCounter != oneCounter
        );
        System.out.println(Arrays.toString(arr));
        System.out.println(comparison);

        if (comparison) {
            System.out.println(Math.max(Math.max(minusOneCounter, zeroCounter), oneCounter));
        }
    }
}
