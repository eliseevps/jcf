//Complete

package task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i : fillIntArray(initializeStringArray())) {
            System.out.println(i);
        }
    }

    public static String[] initializeStringArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        return array;
    }

    public static int[] fillIntArray(String[] arrayStr) {
        int[] arrayInt = new int[10];
        if (arrayInt.length == arrayStr.length) {
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = arrayStr[i].length();
            }
        }
        return arrayInt;
    }
}
