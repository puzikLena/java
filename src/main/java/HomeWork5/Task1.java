package HomeWork5;

import java.util.*;

public class Task1 {

    //    1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//    что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new HashMap<>();

        phonebook.put("Иванов Сергей", createPhoneList("88002008080"));
        phonebook.put("Петров Максим", createPhoneList("89874672904"));
        phonebook.put("Иванов Николай", createPhoneList("89447836611"));
        phonebook.put("Морозов Дмитрий", createPhoneList("89653591188"));
        phonebook.put("Иванов Сергей", createPhoneList("84563443333", "89001234567"));


        Set<String> names = phonebook.keySet();

        for (String name : names) {
            List<String> phones = phonebook.get(name);

            System.out.println(name + ":" + phones);
        }
    }
    static List<String> createPhoneList(String... phones) {
        List<String> phoneList = new ArrayList<>();
        phoneList.addAll(Arrays.asList(phones));
        return phoneList;
    }
}
