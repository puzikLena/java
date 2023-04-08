package HomeWork3;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//        (в языке уже есть что-то готовое для этого)
        List<Integer> intList = new Random().ints(10, 1, 30)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(intList);

        intList.removeIf(num -> num % 2 == 0);
        System.out.println(intList);
    }
}
