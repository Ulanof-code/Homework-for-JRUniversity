package HW28122021;

/*
Задача 4.
Ввести с клавиатуры элементы квадратного двумерного массива целых чисел размерностью 5 на 5.
Елементы массива в диапозоне от 1 до 10.
Проверьте, является  ли  двумерный  массив  симметричным  относительно  главной диагонали.
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
 */
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 11);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        if (isSymmetric(matrix)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = i + 1; j < matrix.length; j++) {
                int num1 = matrix[i][j];
                int num2 = matrix[j][i];
                if (num1 != num2)
                    return false;
            }
        return true;
    }
}

