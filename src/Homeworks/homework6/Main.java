package Homeworks.homework6;

public class Main {
    /*ДЗ 11. Дз.11
    С помощью цикла и условного оператора вывести в консоль:



Это 1-й урок!

      Я выполнил все домашние задания 1-го урока.

Это 2-й урок!

      Я выполнил все домашние задания 2-го урока.

Это 3-й урок!

       Я не выполнил домашние задания 3-го урока.*/
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            if (i < 3) {
                System.out.println("Это " + i + "-й урок!");
                System.out.println("    Я выполнил все домашние задания " + i + "-го урока.");
            } else {
                System.out.println("Это " + i + "-й урок!");
                System.out.println("    Я не выполнил домашнее задание " + i + "-го урока.");
            }

        }



    }


}

