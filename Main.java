package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Cp866");
        ArrayList<NoteBook> notebooks = new ArrayList<NoteBook>();
        Boolean hasFilters = false;
        
        notebooks.add(new NoteBook(4, 60, "WIN", "черный"));
        notebooks.add(new NoteBook(6, 100, "DOS", "черный"));
        notebooks.add(new NoteBook(10, 400, "Linux", "белый"));
        notebooks.add(new NoteBook(12, 500, "WIN", "серебристый"));
        notebooks.add(new NoteBook(16, 1000, "WIN", "черный"));

        
        while (true) {
            if (!hasFilters) {
                System.out.println("Введите цифру соответствующую необходимому критерию");
            } else {
                System.out.println("Введите цифру соответствующую необходимому критерию, либо слово \"Результаты\"");
            }
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.print(": ");
            String parameter = scanner.nextLine();

            if (parameter.equals("Результаты")) {
                notebooks.forEach((notebook) -> {
                    System.out.println(notebooks.indexOf(notebook) + 1 + ") " + notebook.getSpecification());
                });
                break;
            }

            if (Integer.parseInt(parameter) > 4) {
                System.out.println("Некорректное значение\n");
                continue;
            }

            System.out.print("Введите значение: ");
            String value = scanner.nextLine();
            hasFilters = true;

            if (parameter.equals("1")) {
                notebooks.removeIf(notebook -> notebook.getRAM() < Integer.parseInt(value));
            }

            if (parameter.equals("2")) {
                notebooks.removeIf(notebook -> notebook.getROM() < Integer.parseInt(value));
            }

            if (parameter.equals("3")) {
                notebooks.removeIf(notebook -> !notebook.getOS().equals(value));
            }

            if (parameter.equals("4")) {
                notebooks.removeIf(notebook -> !notebook.getColor().equals(value));
            }
        }
    }
}
