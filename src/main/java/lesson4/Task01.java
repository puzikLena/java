package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task01 {
    //    Добавляет элементы в начало(бысрее по результату linkedlist)
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        final int SIZE = 100_000;
        Random random = new Random();

        List<Random> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0, new Random());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Random> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0,new Random());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
