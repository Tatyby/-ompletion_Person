package task.task1;

import task.Person;

public class Main {
    public static void main(String[] args) {
        if (args.length >= 2) {
            Person person = new Person(args[0], args[1]);
            System.out.println(person);
        } else {
            System.out.println("Не хватает параметров");
        }

    }

}