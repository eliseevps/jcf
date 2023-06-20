//Complete

package task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> mapDictionary = new HashMap<>();
        mapDictionary.put("Петров", "Андрей");
        mapDictionary.put("Сидоров", "Илья");
        mapDictionary.put("Колобков", "Андрей");
        mapDictionary.put("Рожков", "Дмитрий");
        mapDictionary.put("Молчанов", "Павел");
        mapDictionary.put("Ляпустин", "Илья");
        mapDictionary.put("Гончаров", "Андрей");
        mapDictionary.put("Гаврилов", "Марат");
        mapDictionary.put("Емельянов", "Андрей");
        mapDictionary.put("Ромашкин", "Глеб");

        return mapDictionary;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Set<String> set = new HashSet<>();

        for (String value : copy.values()) {
            if (set.contains(value)) {
                removeItemFromMapByValue(map, value);
            } else {
                set.add(value);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
