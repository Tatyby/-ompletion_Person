package task.task3;

import task.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        List<Person> listPerson = new ArrayList<>();

        while (flag) {
            System.out.println("Введите Имя или exit для выхода");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("exit")) {
                flag = false;
            } else {
                System.out.println("Введите Фамилию");
                String lastName = scanner.nextLine();
                Person person = new Person(firstName, lastName);
                listPerson.add(person);
            }
        }
        System.out.println("Значения полей списка объектов Person: ");
        listPerson.forEach(System.out::println);
    }
}
