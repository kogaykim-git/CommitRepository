import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirthday;

    public Person(int id, String name, LocalDate dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }
}
