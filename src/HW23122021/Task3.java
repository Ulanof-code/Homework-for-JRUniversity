package HW23122021;

/*
Задача 3.
Имеется массив из четырёх чисел int[] numbers = {4, 99, 18, 15, 1};.
Поменяйте местами первый и второй элемент массива.
 */


public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {3, 99, 18, 15, 1};

        int first = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = first;
    }
}
