import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class DiscountService {
    double discount(double value) {
        return value * 0.8;
    }

    void printAll(List<String> users) {
        System.out.println(users);
    }

    void dataInput(Scanner scanner) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("text.txt"));
        String name = scanner1.nextLine();
    }

    void printFirstPerson(List<Person> personList) {
        Optional<Person> firstPerson = personList.stream()
                .findFirst();
        System.out.println(firstPerson);
    }

    void printPerson(List<Person> personList) {
        System.out.println(personList);
    }

    void printPersonId(List<Person> personList) {
        Optional<Person> firstPerson = personList.stream()
                .findFirst();
        int id = firstPerson.get().getId();
        System.out.println(id);
    }

    void printFirstNameOfPerson(List<Person> personList) {
        Optional<Person> firstPerson = personList.stream()
                .findFirst();
        String name = firstPerson.get().getName();
        System.out.println(name);
    }
}
