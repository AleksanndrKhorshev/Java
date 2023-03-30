package OOP_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class NotebookSorter {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        Random random = new Random();
        String[] brands = {"Lenovo", "Dell", "HP", "Asus", "Acer", "Apple"};

        for (int i = 0; i < 10; i++) {
            int price = random.nextInt(2000) + 500;  // Генерация цены от 500 до 2500
            int ram = random.nextInt(8) + 4;  // Генерация объема ОЗУ от 4 до 12 ГБ
            String brand = brands[random.nextInt(brands.length)]; // Случайный бренд
            notebooks.add(new Notebook(price, ram, brand));
        }

        System.out.println("Сортировка по возрастанию цены:");
        Collections.sort(notebooks, Comparator.comparing(Notebook::getPrice));
        printNotebooks(notebooks);

        System.out.println("Сортировка по убыванию цены:");
        Collections.sort(notebooks, Comparator.comparing(Notebook::getPrice).reversed());
        printNotebooks(notebooks);

        System.out.println("Сортировка по убыванию объема ОЗУ, а затем по убыванию цены:");
        notebooks.sort(Comparator.comparing(Notebook::getRam).reversed().thenComparing(Notebook::getPrice).reversed());
        printNotebooks(notebooks);

        System.out.println("Сортировка по бренду и по возрастанию цены:");
        notebooks.sort(Comparator.comparing(Notebook::getBrand).thenComparing(Notebook::getPrice));
        printNotebooks(notebooks);
    }

    private static void printNotebooks(List<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getBrand() + " - $" + notebook.getPrice() + " - " + notebook.getRam() + "ГБ ОЗУ");
        }
        System.out.println();
    }
}