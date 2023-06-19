//Complete

package task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


Requirements:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
5. Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(numberOfResidents(initializeArray()));
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static String numberOfResidents(int[] array) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (i % 2 == 0) {
                    right += array[i];
                } else {
                    left += array[i];
                }
            }
        }
        if (right > left) {
            return "В домах с четными номерами проживает больше жителей. (" + right + " > " + left + ")";
        } else if (left > right) {
            return "В домах с нечетными номерами проживает больше жителей. (" + right + " < " + left + ")";
        }
        return "";
    }
}
