package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task1 {
//    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке.
    public static void main(String[] args) {
            String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
            Random random = new Random();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                list.add(arrPlanet[random.nextInt(9)]);
            }
            System.out.println(list);

            list.sort(Comparator.naturalOrder());
            StringBuilder sb = new StringBuilder();
            System.out.println(list);
            int count = 1;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).equals(list.get(i+1))) {
                    count++;
                }else{
                    sb.append(list.get(i))
                            .append(": ")
                            .append(count)
                            .append("; ");
                    count = 1;
                }
            }
            sb.append((list.get(list.size() - 1) + ": ")).append(count).append(".");
            System.out.println(sb);
        }

    }

