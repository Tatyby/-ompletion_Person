package task.task7.Actions;

import task.Person;

import java.util.List;

public class ClearDataMemoryImp implements Exec{
    @Override
    public void exec(List<Person> data){
        data.clear();
        System.out.println("Список объектов Person очищен.");

    }
}
