package HomeWork4;

import java.util.*;

public class Task1 {
//    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Введите строку: ");
        List<String> lines = new ArrayList<>();
        boolean isRunning = true;
        while (isRunning) {
            String lineFromConsole = text.nextLine();
            switch (lineFromConsole) {
                case "print":
                    isRunning = false;
                    break;
                case "revert":
                    if (!lines.isEmpty()) {
                        lines.remove(lines.size() - 1);
                    }
                    break;
                default:
                    lines.add(lineFromConsole);
                    break;
            }
        }
        Collections.reverse(lines);
        System.out.println(lines);
    }
}


