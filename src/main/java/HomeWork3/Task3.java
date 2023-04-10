package HomeWork3;

import java.util.*;

public class Task3 {
    //    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    public static void main(String[] args) {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        System.out.println(list);
        System.out.println("=".repeat(20));

        list.sort(Comparator.naturalOrder());

        Set<String> planetSet = new HashSet<>(list);
        for (String planet : planetSet) {
            System.out.println(planet);
        }
    }
}
