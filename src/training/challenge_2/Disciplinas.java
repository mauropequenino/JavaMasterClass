package training.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
    private List<Disciplina> subjects;

    public Disciplinas() {
        this.subjects = new ArrayList<Disciplina>();
    }

    public boolean isStudentEnrolled(Disciplina subject, String studentName) {
        if ((findSubject(subject) >= 0) && (subject.findStudent(studentName) >= 0)){
          return true;
        }
        return false;
    }

    public boolean addStudent(Disciplina subject, Aluno aluno){
        int position = findSubject(subject);
        if(position >=0) {
            subjects.get(position).addNewStudent(aluno);
            return true;
        }
        return false;
    }

    public boolean removeStudent(Disciplina subject, Aluno aluno) {
        int position = findSubject(subject);
        if(position >= 0) {
            subjects.get(position).removeStudent(aluno);
            return true;
        }
        return false;
    }

    public boolean openSubject(String subject, Docente docente) {
        int position = findSubject(subject);
        if(position >= 0) {
            subjects.add(new Disciplina(subject, docente));
            return true;
        }
        return false;
    }

    public boolean closeSubject(Disciplina subject) {
        int position = findSubject(subject);
        if (position >= 0) {
            subjects.remove(subject);
            return true;
        }
        return false;
    }

    public void getSubjectStudents(String subject) {
        int position = findSubject(subject);
        System.out.println("Alunos: ");
        for(int i=0;i<subjects.size();i++) {
            subjects.get(position).getStudents();
        }
    }

    public void getSubjectTeacher(String subject) {
        int position = findSubject(subject);
        System.out.println("Docente: " + subjects.get(position).getNameTeacher());
    }
    private int findSubject(String subject) {
        for (int i=0;i<subjects.size();i++){
            Disciplina s = subjects.get(i);
            if(s.getSubjectName().equalsIgnoreCase(subject)){
                return i;
            }
        }
        return -1;
    }
    public int findSubject (Disciplina subject) {
        return subjects.indexOf(subject);
    }

    @Override
    public String toString() {
        String s = "{";
               s += "\n\tTotal de Disciplina =" + subjects.size();
               s += "\n\tDiscuplinas: [";
               for(int i=0;i<subjects.size();i++) {
                   s += "\n\t\tNome: " + subjects.get(i).getSubjectName();
                   s += "\n\t\tDocente: " + subjects.get(i).getNameTeacher();
                   s += "\n\t\tAlunos: [";
                   subjects.get(i).getStudents();
                   s += "\n\t\t]";
               }
               s += "\n\t]";
               s += "}";
        return s;
    }

}

