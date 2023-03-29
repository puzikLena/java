package HomeWork1;

import java.util.Random;

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Task1 {

    public static void main(String[] args) {
        Random mass = new Random();
        int[] array = new int[10];
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = mass.nextInt(100);
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + "  ");
            }

            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент => " + max);
        System.out.println("Минимальный элемент => " + min);
    }
}

