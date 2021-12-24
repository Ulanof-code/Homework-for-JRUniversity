package HW23122021;

/*
Задача 2. Создать массив типа String с размером 7.
Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
 */

public class Task2 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfWeek[daysOfWeek.length-1]);
    }
}
