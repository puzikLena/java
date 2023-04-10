package lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    //    Реализовать консольное приложение, которое:
//    Принимает от пользователя строку вида
//    text~num
//    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        while (true) {
            System.out.printf("Введите строку-позицию: ");
            String text = in.nextLine();

            String[] array = text.split("\\~");
            int index = Integer.parseInt(array[1]);
            String val = array[0];
            if (val.equals("print")) {
                if (list.get(index) == null) {
                    System.out.println("значения нет");
                } else {
                    System.out.println(list.get(index));
                    list.remove(index);
                }
            } else {
                if (index < list.size()) {
                    list.set(index, val);
                } else {
                    for (int i = list.size(); i < index - 1; i++) {
                        list.add(null);
                    }
                    list.add(val);
                }
            }
            System.out.println(list);

        }

    }
}
