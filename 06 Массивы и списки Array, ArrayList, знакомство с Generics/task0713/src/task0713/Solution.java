//Complete

package task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Золушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Requirements:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListDivThree = new ArrayList<>();
        ArrayList<Integer> arrayListDivTwo = new ArrayList<>();
        ArrayList<Integer> arrayListOther = new ArrayList<>();
        initializeArray(arrayList);

        for (Integer i : arrayList) {
            if (i % 3 == 0 && i % 2 == 0) {
                arrayListDivThree.add(i);
                arrayListDivTwo.add(i);
            } else if (i % 3 == 0) {
                arrayListDivThree.add(i);
            } else if (i % 2 == 0) {
                arrayListDivTwo.add(i);
            } else {
                arrayListOther.add(i);
            }
        }

        printList(arrayListDivThree);
        printList(arrayListDivTwo);
        printList(arrayListOther);
    }

    public static void initializeArray(ArrayList<Integer> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
    }


    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
