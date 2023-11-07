package task.task7;

import task.Person;
import task.task7.Actions.AddPersonImp;
import task.task7.Actions.ExitActionImp;
import task.task7.Actions.ShowPersonImp;
import task.task7.Menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(personList, scanner);
        menu.addItem("Add Person", new AddPersonImp());
        menu.addItem("ShowPerson", new ShowPersonImp());
        menu.addItem("Exit", new ExitActionImp());
        menu.run();
    }
}
