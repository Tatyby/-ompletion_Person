package task.task7.Actions;

import task.Person;

import java.util.List;

public class ExitActionImp implements Exec {
    @Override
    public void exec(List<Person> data) {
        System.out.println("Выход из программы");
        System.exit(0);
    }
}
