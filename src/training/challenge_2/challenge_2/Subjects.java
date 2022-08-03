package training.challenge_2.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
    private List<Subject> subjectList;

    public Subjects() {
        subjectList = new ArrayList<Subject>();
    }

    public boolean isStudentEnrolledIntSubject(String subjectName, String studentName) {
        int position = findSubject(subjectName);
        if((position >= 0) && (subjectList.get(position).findStudentByName(studentName)>= 0))
            return true;
        return false;
    }

    public boolean addStudentToSubject(String subjectName, Student student){
        int position = findSubject(subjectName);
        if((position >= 0) && (subjectList.get(position).addStudentToSubject(student))) {
            return true;
        }
        return false;
    }

    public boolean removeStudentFromSubject(String subjectName, String studentName){
        int position = findSubject(subjectName);
        if((position >= 0) && (subjectList.get(position).removeStudentFromSubject(studentName))) {
            return true;
        }
        return false;
    }

    public boolean addSubject(String subjectName, Teacher teacher){
        int position =findSubject(subjectName);
        if(position >= 0) {
            System.out.println("Subject already existis");
            return false;
        }
        subjectList.add(new Subject(subjectName,teacher));
        return true;
    }

    public boolean removeSubject(String subjectName){
        int position =findSubject(subjectName);
        if(position >= 0) {
            subjectList.remove(position);
            return true;
        }
        return false;
    }

    public void getAllStudentsFromSubject(String subjectName) {
    	int position = findSubject(subjectName);
    	if(position >= 0) {
    		for(Student s : subjectList.get(position).getAllStudentsFromSubject()) {
    			System.out.println(s.getStudentCode() + " - " + s.getStudentName());
    		}
    	} else {
    		System.out.println("No students ...");
    	}
    }
    

    private int findSubject(String subjectName){
        for (int i=0;i<subjectList.size();i++){
            Subject subject = subjectList.get(i);
            if(subject.getSubjectName().equalsIgnoreCase(subjectName))
                return i;
        }
        return -1;
    }
    
    @Override
    public String toString() {
        String s = "{";
               s += "\n\tTotal subjects =" + subjectList.size();
               s += "\n\tSubjcts: [";
               for(int i=0;i<subjectList.size();i++) {
                   s += "\n\t\tSubject: " + subjectList.get(i).getSubjectName();
                   s += "\n\t\tTeacher: " + subjectList.get(i).getTeacher().getTeacherName();
                   s += "\n\t\tStudents: [";
                   for(Student st : subjectList.get(i).getAllStudentsFromSubject()){
                       s += "\n\t\t\t" + st.getStudentCode() + " -> " + st.getStudentName();
                   }
                   s += "\n\t\t]";
               }

               s += "\n}";
        return s;
    }
}
