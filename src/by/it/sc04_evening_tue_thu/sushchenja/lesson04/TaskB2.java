package by.it.sc04_evening_tue_thu.sushchenja.lesson04;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-4.75 -5.25

Ввод:
2 4 2
Вывод:
-1

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static void main(String[] args) {
        int a, b, c;
        double D, x1, x2;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        D = dis(a,b,c);
        x2=(-1*b-Math.sqrt(D)/(2*a));
        x1=(-1*b+Math.sqrt(D)/(2*a));
        if(D<0) System.out.println("Отрицательный дискриминант");
        if(D==0) System.out.println((int) (-1*b/(2*a)));
        if(D>0) System.out.println(x1+" "+x2);
    }

    public static double dis(int a,int b,int c){
        return b*b - 4*a*c;
    }
}
