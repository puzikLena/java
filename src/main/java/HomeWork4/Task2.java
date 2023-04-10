package HomeWork4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    //    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    public static void main(String[] args) {

        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "1", "2", "3", "4", "5", "6");
        System.out.println(getReversedList(wordsList));
    }

    static List<String> getReversedList(List<String> src) {
        LinkedList<String> reversWordsList = new LinkedList<>();
        for (int i = 0; i < src.size(); i++) {
            int newIndex = src.size() - 1 - i;
            reversWordsList.add(src.get(newIndex));
        }
        return reversWordsList;
    }
}

