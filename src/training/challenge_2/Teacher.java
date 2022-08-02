package training.challenge_2;
public class Teacher extends Person {
    private String code;

    public Teacher(int id,String firstName, String lastName, String code) {
        super(id,firstName,lastName);
        this.code = code;
    }

    public String getTeacherName() {
        return super.getFirstName() + " " + super.getLastName();
    }

    public String getTeacherCode() {
        return this.code;
    }

    @Override
    public String toString() {
        String s = "Teacher {";
        s += "\n\t Name: " + getTeacherName();
        s += "\n\t Code: " + getTeacherCode();
        s += "\n}";
        return s;
    }

}
