package HW25122021;

/*
Задача 5.
Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] включительно таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей.
При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
когда в массиве постоянно выпадает сначала 6 положительных,
а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
Вывести полученный массив на экран.
 */

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] result = new int[12];
        int[] tmpArr1 = new int[result.length / 2];
        int[] tmpArr2 = new int[result.length / 2];

        for (int i = 0; i < tmpArr1.length; i++) {
            int randInt = random.nextInt(-10, 0);
            if (!searchSame(randInt, tmpArr1)) {
                tmpArr1[i] = randInt;
            } else {
                while (searchSame(randInt, tmpArr1)) {
                    randInt = random.nextInt(-10, 0);
                    if (!searchSame(randInt, tmpArr1)) {
                        tmpArr1[i] = randInt;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < tmpArr2.length; i++) {
            int randInt = random.nextInt(1, 11);
            if (!searchSame(randInt, tmpArr2)) {
                tmpArr2[i] = randInt;
            } else {
                while (searchSame(randInt, tmpArr2)) {
                    randInt = random.nextInt(1, 11);
                    if (!searchSame(randInt, tmpArr2)) {
                        tmpArr2[i] = randInt;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arrayCombining(result, tmpArr1, tmpArr2)));
        System.out.println(Arrays.toString(tmpArr1));
        System.out.println(Arrays.toString(tmpArr2));
    }

    private static boolean searchSame(int lookingFor, int[] searchHere) {
        for (int i = 0; i < searchHere.length; i++) {
            if (lookingFor == searchHere[i]) {
                return true;
            }
        }
        return false;
    }

    private static int[] arrayCombining(int[] result, int[] firstArr, int[] secondArr) {
        Random random = new Random();
        int switchCounterForOne = 0;
        int switchCounterForTwo = 0;
        int randIndexForArrays;

        for (int i = 0; i < result.length; i++) {
            int randIndexForResult = random.nextInt(result.length);
            int switcher = random.nextInt(1, 3);
            if (switchCounterForOne == 6) {
                switcher = 2;
            }
            if (switchCounterForTwo == 6) {
                switcher = 1;
            }

            if (result[randIndexForResult] == 0) {
                if (switcher == 1) {  // ARR 1
                    randIndexForArrays = random.nextInt(firstArr.length);
                    for (int j = 0; j < result.length; j++) {
                        if (firstArr[randIndexForArrays] != result[i]) {
                            result[i] = firstArr[randIndexForArrays];
                        } else {
                            while (searchSame(firstArr[randIndexForArrays], result)) {
                                randIndexForArrays = random.nextInt(secondArr.length);
                                if (firstArr[randIndexForArrays] != result[i]) {
                                    result[i] = firstArr[randIndexForArrays];
                                    break;
                                }
                            }
                        }
                    }
                    switchCounterForOne++;
                }
                if (switcher == 2) {  // ARR 2
                    randIndexForArrays = random.nextInt(firstArr.length);
                    for (int j = 0; j < result.length; j++) {
                        if (firstArr[randIndexForArrays] != result[i]) {
                            result[i] = secondArr[randIndexForArrays];
                        } else {
                            while (searchSame(secondArr[randIndexForArrays], result)) {
                                randIndexForArrays = random.nextInt(secondArr.length);
                                if (firstArr[randIndexForArrays] != result[i]) {
                                    result[i] = secondArr[randIndexForArrays];
                                    break;
                                }
                            }
                        }
                    }
                    switchCounterForTwo++;
                }
            }
        }
        return result;
    }

}
