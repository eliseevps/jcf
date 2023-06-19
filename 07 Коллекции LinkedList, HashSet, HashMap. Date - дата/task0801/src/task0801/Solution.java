//Complete

package task0801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.


Requirements:
1. Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Set<String> list = new HashSet<>();

        initializeArray(list);

        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void initializeArray(Set<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
    }
}
