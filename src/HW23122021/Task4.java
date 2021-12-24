package HW23122021;

/*
Задача 4.
Есть массив int [] arr = {1, 76, 6, 43, 56, 2, 0, 18, 100, -7, 12, 90, 67, -32, 15}.
Замените значение каждого элемента с нечётным индексом на ноль.
Выведете массив на экран строкой, отделяя элементы между собой пробелом.
 */

public class Task4 {
    public static void main(String[] args) {
        int [] arr = {1, 76, 6, 43, 56, 2, 0, 18, 100, -7, 12, 90, 67, -32, 15};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }

            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }

        }
    }
}