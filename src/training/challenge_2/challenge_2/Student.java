package training.challenge_2.challenge_2;

public class Student extends Person {
    private String code;

    public Student(int id, String firstName, String lastName, String code){
        super(id, firstName,lastName);
        this.code = code;
    }

    public String getStudentName(){
        return super.getFirstName()+ " " +super.getLastName();
    }

    public String getStudentCode() {
        return this.code;
    }

    @Override
    public String toString() {
        String s = "Student {";
        s += "\n\t Name: " + getStudentName();
        s += "\n\t Code: " + getStudentCode();
        s += "\n}";
        return s;
    }
}
