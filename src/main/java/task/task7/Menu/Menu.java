package task.task7.Menu;

import task.Person;
import task.task7.Actions.Exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final List<MenuItem> items = new ArrayList<>();
    private final List<Person> personList;
    private final Scanner scanner;

    public Menu(List<Person> personList, Scanner scanner) {
        this.personList = personList;
        this.scanner = scanner;
    }

    public void addItem(String name, Exec exec) {
        items.add((new MenuItem(name, exec)));
    }

    public void run() throws Exception {
        while (true) {
            showMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice > 0 && choice <= items.size()) {
                    MenuItem menuItem = items.get(choice - 1);
                    menuItem.execute(personList);
                } else {
                    System.out.println("Не верный выбор. Выберите корректный пункт меню.");
                }
            } else {
                System.out.println("Не верный ввод. введите корректное ЧИСЛО.");
                scanner.next(); //считываем некорректное значение, иначе зацикливается
            }
        }
    }

    private void showMenu() {
        System.out.println("Выберите действие");
        System.out.println("Меню: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName());
        }
    }
}
