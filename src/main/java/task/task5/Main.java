package task.task5;

import task.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        Menu menu = new Menu();
        while (true) {
            menu.menu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Введите имя:");
                        String firstName = scanner.nextLine();
                        System.out.println("Введите фамилию: ");
                        String lastName = scanner.nextLine();
                        Person person = new Person(firstName, lastName);
                        personList.add(person);
                        System.out.println("объект Person добавлен в список");
                    }
                    case 2 -> {
                        System.out.println("Список объектов: ");
                        personList.forEach(System.out::println);
                    }
                    case 3 -> {
                        List<Person> personListUnique = personList.stream()
                                .collect(Collectors.toMap(Person::getLastName, p -> p, (existing, replacement) -> existing))
                                .values().stream()
                                .sorted(Comparator.comparing(Person::getLastName))
                                .toList();
                        personListUnique.forEach(System.out::println);
                    }
                    case 4 -> {
                        System.out.println("Выход из программы.");
                        return;
                    }
                    default -> System.out.println("Не правильный выбор, попрбуйте еще раз");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Введите число от 1 до 3");
                scanner.nextLine();
            }
        }
    }
}
