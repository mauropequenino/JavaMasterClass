package training.challenge_2.challenge_2;

public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(int id,String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
