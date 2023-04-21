package HomeWork6;


import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Notebooks {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "HP", "15-dw1210nia 23H98EA", "black", 4, 1024);
        Notebook notebook2 = new Notebook(2, "ASUS", "A516JF-BQ328", "grey", 8, 512);
        Notebook notebook3 = new Notebook(3, "Lenovo", "IdeaPad 5 15ITL05 82FG0165US", "black", 8, 256);
        Notebook notebook4 = new Notebook(4, "Apple", "MacBook Pro 16 M2 Pro", "red", 16, 512);
        Notebook notebook5 = new Notebook(5, "Apple", "MacBook Air 13 M2", "grey", 8, 512);

        List<Notebook> notebookList = List.of(notebook1, notebook2, notebook3, notebook4, notebook5);
        Set<String> colors = notebookList.stream().map(notebook -> notebook.getColour()).collect(Collectors.toSet());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите цвет %s: ".formatted(colors.toString()));
        String selectedColor = scanner.nextLine();

        List<Notebook> colorFilteredNotebookList = notebookList.stream()
                .filter(notebook -> notebook.getColour().equalsIgnoreCase(selectedColor))
                .toList();

        if (colorFilteredNotebookList.isEmpty()) {
            System.out.println("Не найдено ноутбуков по указанному цвету " + selectedColor);
            return;
        }

        Set<String> brands = notebookList.stream().map(notebook -> notebook.getBrand()).collect(Collectors.toSet());
        System.out.println("Укажите бренд %s: ".formatted(brands.toString()));
        String selectedBrand = scanner.nextLine();

        List<Notebook> brandFilteredNotebookList = colorFilteredNotebookList.stream()
                .filter(notebook -> notebook.getBrand().equalsIgnoreCase(selectedBrand)).toList();

        if (brandFilteredNotebookList.isEmpty()) {
            System.out.println("Не найдено ноутбуков по указанному бренду " + selectedBrand);
            return;
        }

        Set<Integer> ramMemory = notebookList.stream().map(notebook -> notebook.getRamMemory()).collect(Collectors.toSet());
        System.out.println("Укажите объем оперативной памяти %s: ".formatted(ramMemory.toString()));
        int selectedRam = scanner.nextInt();

        List<Notebook> ramFilteredNotebookList = brandFilteredNotebookList.stream()
                .filter(notebook -> notebook.getRamMemory() == selectedRam).toList();

        if (ramFilteredNotebookList.isEmpty()) {
            System.out.println("Не найдено ноутбуков по указанному бренду " + selectedRam);
            return;
        }
        System.out.println(ramFilteredNotebookList);
    }
}
