package training.challenge_2.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String subjectName;
    private Teacher teacher;
    private List<Student> studentList;

    public Subject(String subjectName, Teacher teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.studentList = new ArrayList<Student>();
    }

    public int findStudentByName(String studentName){
        for(int i=0; i<studentList.size(); i++){
            Student student = studentList.get(i);
            if(student.getStudentName().equalsIgnoreCase(studentName))
            return i;
        }
        return -1;
    }

    public int findStudentByCode(String studentCode){
        for(int i=0;i<studentList.size();i++){
            Student student = studentList.get(i);
            if(student.getStudentCode().equalsIgnoreCase(studentCode))
                return i;
        }
        return -1;
    }

    private int findStudentByObject(Student student) {
        return studentList.indexOf(student);

    }

    public boolean addStudentToSubject(Student student){
        int position = findStudentByObject(student);
        if(position >= 0) {
            System.out.println("Student is already enrolled!");
            return false;
        }
        this.studentList.add(student);
        return true;
    }

    public boolean removeStudentFromSubject(String studentName) {
        int position = findStudentByName(studentName);
        if(position >= 0){
            studentList.remove(position);
            return true;
        }
        System.out.println("Student doesnt exist!");
        return false;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public String getStudentByName(String name){
        int position = findStudentByName(name);
        if(position >= 0)
            return studentList.get(position).toString();
        return null;
    }

    public String getStudentByCode(String code){
        int position = findStudentByCode(code);
        if(position >= 0)
            return studentList.get(position).toString();
        return null;
    }

    public List<Student> getAllStudentsFromSubject(){
        return studentList;
    }

    @Override
    public String toString() {
        String s = "Subject {";
               s+= "\n\tSubject: " + getSubjectName();
               s+= "\n\tTeacher: " + getTeacher().getTeacherName();
               s+= "\n\tStudents: [";
               for (Student a : studentList) {
                   s += "\n\t\t" + a.getStudentName() + " - " + a.getStudentName();
               }
               s+= "\n\t]";
               s+= "\n}";
        return s;
    }
}
