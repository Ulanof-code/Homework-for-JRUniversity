import java.util.Arrays;

/*
Задача 1. Создать массив из десяти целых чисел и вывести его на консоль.
Создать массив из 10 строковых значений и вывести его на консоль.
 */

public class Task1 {
    public static void main(String[] args) {

        int[] arrInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrInt));

        String[] arrStr = {"Утром", "Я", "Сильней", "Но", "Всего", "Верней", " При", "Луне", "Надуваю", "Парус"};
        System.out.println(Arrays.toString(arrStr));
    }
}
