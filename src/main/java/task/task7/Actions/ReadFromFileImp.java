package task.task7.Actions;

import task.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileImp implements Exec {
    @Override
    public void exec(List<Person> data) {
        String nameFile = "PersonList.txt";
        List<Person> loadPersonList = loadFromFile(nameFile);
        data.clear(); //очищаем текущий список
        data.addAll(loadPersonList);
        System.out.println("Список Person загружен из файла " + nameFile);
        data.forEach(System.out::println);

    }

    private List<Person> loadFromFile(String filePath) {
        List<Person> personList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Person person = creatPerson(line);
                if (person != null) {
                    personList.add(person);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;

    }

    private Person creatPerson(String line) {
        int firstNameStart = line.indexOf("firstName='") + "firstName='".length();
        int firstNameEnd = line.indexOf("',", firstNameStart);
        int lastNameStart = line.indexOf("lastName='", firstNameEnd) + "lastName='".length();
        int lastNameEnd = line.indexOf("'}", lastNameStart);
        if (firstNameStart < firstNameEnd && lastNameStart < lastNameEnd) {
            String firstName = line.substring(firstNameStart, firstNameEnd);
            String lastName = line.substring(lastNameStart, lastNameEnd);
            return new Person(firstName, lastName);
        }
        return null;
    }
}
