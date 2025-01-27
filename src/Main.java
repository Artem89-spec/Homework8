import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] arrIntegers = new int[3];
        arrIntegers[0] = 1;
        arrIntegers[1] = 2;
        arrIntegers[2] = 3;

        double[] arrDoubles = {1.57, 7.654, 9.986};

        boolean[] arrBooleans = {true, false, true, false};

        //Задача 2
        //вывод значений 1 массива
        for (int i = 0; i < arrIntegers.length; i++) {
            System.out.printf("%d", arrIntegers[i]);
            if (i < arrIntegers.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.println();
        //вывод значений 2 массива
        for (int i = 0; i < arrDoubles.length; i++) {
            if (i == arrDoubles.length - 1) {
                System.out.print(arrDoubles[i]);
                break;
            }
            System.out.print(arrDoubles[i] + ", ");
        }
        System.out.println();
        //вывод значений 3 массива
        for (int i = 0; i < arrBooleans.length; i++) {
            System.out.printf("%s", arrBooleans[i]);
            if (i < arrBooleans.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.println();
        System.out.println();

        //Задача 3
        //вывод значений 1 массива в обратном порядке
        for (int i = arrIntegers.length - 1; i >= 0; i--) {
            System.out.printf("%d", arrIntegers[i]);
            if (i > 0) {
                System.out.printf(", ");
            }
        }
        System.out.println();
        //вывод значений 2 массива в обратном порядке
        for (int i = arrDoubles.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arrDoubles[i]);
                break;
            }
            System.out.print(arrDoubles[i] + ", ");
        }
        System.out.println();
        //вывод значений 3 массива в обратном порядке
        for (int i = arrBooleans.length - 1; i >= 0; i--) {
            System.out.printf("%s", arrBooleans[i]);
            if (i > 0) {
                System.out.printf(", ");
            }
        }
        System.out.println();
        System.out.println();

        //Задача 4
        int i = 0;
        while (i < 3) {
            if (arrIntegers[i] % 2 != 0) {
                arrIntegers[i] += 1;
            }
            i++;
        }
        System.out.println(Arrays.toString(arrIntegers));
    }
}