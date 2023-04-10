package HomeWork3;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
//        2. Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее арифметическое из этого списка.
        List<Integer> arrayList = new Random().ints(10, 1, 30)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(arrayList);

        double avg = arrayList
                .stream()
                .mapToInt(a -> a)
                .average().orElse(0);

        System.out.println("среднее арифметическое => " + avg);

        int max = arrayList.stream().max(Integer::compareTo).orElse(0);
        int min = arrayList.stream().min(Integer::compareTo).orElse(0);

        System.out.println("Максимальный элемент => " + max);
        System.out.println("Минимальный элемент => " + min);
    }

}
