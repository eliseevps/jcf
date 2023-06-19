//Complete

package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> strings = new ArrayList<>();

        initializeArrayN(strings, n);
        swapArrayM(strings, m);

        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void initializeArrayN(ArrayList<String> arrayList, int length) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < length; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void swapArrayM(ArrayList<String> arrayList, int length) {
        for (int i = 0; i < length; i++) {
            arrayList.add(arrayList.get(0));
            arrayList.remove(0);
        }
    }
}
