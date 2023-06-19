//Complete

package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Anton", true, 70);
        Human human2 = new Human("Anna", false, 65);
        Human human3 = new Human("George", true, 66);
        Human human4 = new Human("Penelopa", false, 60);
        Human human5 = new Human("Kirill", true, 40, human1, human2);
        Human human6 = new Human("Alina", false, 39, human3, human4);
        Human human7 = new Human("Pavel", true, 18, human5, human6);
        Human human8 = new Human("Yuri", true, 16, human5, human6);
        Human human9 = new Human("Katerina", false, 16, human5, human6);

        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);
        humans.add(human6);
        humans.add(human7);
        humans.add(human8);
        humans.add(human9);

        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}