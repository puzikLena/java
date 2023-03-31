package lesson2;

public class Task1 {
    private static void returnLengthN() {
        int n = 2;
        StringBuilder a = new StringBuilder("a");
        StringBuilder b = new StringBuilder("B");
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c.append(a);
            } else {
                c.append(b);
            }
        }
        System.out.println(c);
    }
}
