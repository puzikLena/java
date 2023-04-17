package lesson6;

import java.util.*;

public class Cat {
    int id;
    String name;
    int age;
    String type;
    String ownerSurname;

    public String toString() {
        return String.format("%d %s %d %s %s", id, name, age, type, ownerSurname);
    }

    public static void meow() {
        System.out.println("meow");

    }
}
