package HW23122021;

import java.util.Arrays;

/*
Задача 5.
Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
Выведите конечный (поменяный) массив в консоль.
 */


public class Task5 {
    public static void main(String[] args) {
        String[] arrStr = {"Утром", "Я", "Сильней", "Но", "Всего", "Верней", " При", "Луне", "Надуваю", "Парус"};
        String tmp;

        for (int i = 0; i < (arrStr.length / 2); i++) {
            tmp = arrStr[(arrStr.length - 1) - i];
            arrStr[(arrStr.length - 1) - i] = arrStr[i];
            arrStr[i] = tmp;
        }

        System.out.println(Arrays.toString(arrStr));




    }
}