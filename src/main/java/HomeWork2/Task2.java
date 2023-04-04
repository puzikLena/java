package HomeWork2;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class Task2 {
    //    2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args) {
        String str = "TEST".repeat(100);
        System.out.println("String :" + str);
        writingStringToFile(str);
    }

    public static void writingStringToFile(String str) {
        try {
            FileWriter file = new FileWriter("Task2Test.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write(str);
            buffer.flush();
            buffer.close();
            System.out.println("Файл успешно записан");
        } catch (Exception e) {
            System.err.println("Произошла ошибка записи");
            e.printStackTrace();
        }
    }
}
