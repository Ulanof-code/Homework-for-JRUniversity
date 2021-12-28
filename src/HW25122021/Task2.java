package HW25122021;

/*
Задача 2.
Создайте массив из 25 элементов и заполните его случайными числами от 1 до 25 включительно.
Пусть пользователь введет случайное число из указанного выше диапозона.
Найдите в массиве первый элемент, который равен введенному пользователем числу.
Выведите на экран индекс найденного элемента, или, если элемент не найден, соответствующее сообщение.
 */

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 25);
        }
        int searchInt = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchInt) {
                System.out.println(i);
                break;
            }
            if (i == 24) {
                System.out.println("Число в массиве не найдено!");
            }
        }
    }
}
