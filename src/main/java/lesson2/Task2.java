package lesson2;

//Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.

public class Task2 {
    private static void stringCompression() {
        String str = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(str.charAt(i)).append(count);
                } else {
                    res.append(str.charAt(i));
                }
                count = 1;
            }
        }
        res.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(res);
    }
}
