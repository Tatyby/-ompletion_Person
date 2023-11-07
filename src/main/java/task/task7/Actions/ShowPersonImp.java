package task.task7.Actions;

import task.Person;

import java.util.List;

public class ShowPersonImp implements Exec {
    @Override
    public void exec(List<Person> data) {
        System.out.println("Список объектов Person:");
        data.forEach(System.out::println);
    }
}
