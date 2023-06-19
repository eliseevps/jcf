//Complete

package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        initializeArray(strings);
        checkLength(strings);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void checkLength(ArrayList<String> arrayList) {
        int index = -1;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1).length() > arrayList.get(i).length()) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Список упорядочен по возрастанию длины элементов.");
        } else {
            System.out.println("Список не упорядочен. Нарушает порядок элемент с индексом - " + index);
        }
    }
}

