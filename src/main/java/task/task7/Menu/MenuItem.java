package task.task7.Menu;

import task.Person;
import task.task7.Actions.Exec;

import java.util.List;

public class MenuItem {
    private final String name;
    private final Exec exec;

    public MenuItem(String name, Exec exec) {
        this.name = name;
        this.exec = exec;
    }

    public String getName() {
        return name;
    }

    public void execute(List<Person> data) throws Exception {
        exec.exec(data);

    }
}
