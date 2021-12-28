package HW28122021;

/*
Задача 1. Создать массив типа String размером 3 на 6.
И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
Вывести массив на консоль.
 */

public class Task1 {
    public static void main(String[] args) {
        String[][] arr = new String[3][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0) {
                    System.out.printf("%s%s", "a", (j+1));
                    if (j == 5)
                        break;
                }
                if (i == 1) {
                    System.out.printf("%s%s", "b", (j+1));
                    if (j == 5)
                        break;
                }
                if (i == 2) {
                    System.out.printf("%s%s", "c", (j+1));
                    if (j == 5)
                        break;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
