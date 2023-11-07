package task.task7.Actions;

import task.Person;

import java.util.List;
import java.util.Scanner;

public class AddPersonImp implements Exec {
    @Override
    public void exec(List<Person> data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        data.add(new Person(firstName, lastName));
        System.out.println("Объект Person добавлен в список.");
    }
}
