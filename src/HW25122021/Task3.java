package HW25122021;

/*
Задача 3.
Дан массив с числами [5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4].
Переместить все нули в конец массива.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        for (int i = 0; i < arr.length; i++) {
            int currentInt = arr[i];
            if (currentInt == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = currentInt;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
