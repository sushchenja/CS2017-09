package by.it.sc02_morning.golikov.lesson07;

import by.it.examples.lesson06.While;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/

public class TaskA2 {
    public static void main(String[] args) {
        ArrayList<String> arrs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.next();
            if (line.equals("END")) break;
            arrs.add(line);
        }
        System.out.println(arrs);
    }
}