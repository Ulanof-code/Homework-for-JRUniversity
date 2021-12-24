package HW23122021;

/*
Задача 6.
Создайте массив из 15 случайных целых чисел из отрезка от -50 до 50.
Определите какой элемент является в этом массиве максимальным.
Для генерации случайных чисел использовать Math.random().
Выведите сам массив и его максимальный элемент на консоль
 */

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] randNumbers = new int[15];

        int startValue = -50;
        int finishValue = 100;

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = startValue + (int) (Math.random() * finishValue);
        }
        int maxValue = Integer.MIN_VALUE;
        for (int randNumber : randNumbers) {
            if (randNumber > maxValue) {
                maxValue = randNumber;
            }
        }
        System.out.println(Arrays.toString(randNumbers));
        System.out.println(maxValue);
    }
}