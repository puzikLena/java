package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task0 {
    public static void main(String[] args) {
//        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//        Вывести данные по сотрудникам с фамилией Иванов.
        Map<String, String> passportsToSernameMap = new HashMap<>();
        passportsToSernameMap.put("134234", "Иванов");
        passportsToSernameMap.put("345345", "Петров");
        passportsToSernameMap.put("546456", "Васильев");

 System.out.println(passportsToSernameMap);

for (Map.Entry<String, String> entry : passportsToSernameMap.entrySet()) {
System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
}

/* for (String key : passportsToSernameMap.keySet()) {
System.out.printf("%s\t%s%n", key, passportsToSernameMap.get(key));
}*/

/* passportsToSernameMap.forEach((key, value) -> System.out.printf(
"%s\t%s%n",
key, value)
);*/

    }
}
