package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputNameAndPrint();
    }
//    1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

    private static void inputNameAndPrint() {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.printf("Привет, %s", name);
//        scanner.close();
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Привет, %s%n", name);
    }
}


