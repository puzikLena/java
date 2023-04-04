package HomeWork2;

public class Task1 {
    /*
     * Напишите метод, который принимает на вход строку (String)
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     */
    public static void main(String[] args) {
        String st = "топор";
        System.out.println(st);
        if (st.equals(new StringBuilder(st).reverse().toString())){
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}

