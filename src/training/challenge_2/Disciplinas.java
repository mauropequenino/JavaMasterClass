package training.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
    private List<Disciplina> subjects;

    public Disciplinas() {
        this.subjects = new ArrayList<Disciplina>();
    }

    public boolean isStudentEnrolled(String subject, String studentName) {
        int position = findSubject(subject);
        if ((position >= 0) && (subjects.get(position).findStudent(studentName) >= 0)){
          return true;
        }
        return false;
    }

    public boolean addStudent(String subject, Aluno aluno){
        int position = findSubject(subject);
        if(position >=0) {
            subjects.get(position).addNewStudent(aluno);
            return true;
        }
        return false;
    }

    public boolean removeStudent(String subject, Aluno aluno) {
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
            return false;
        }
        subjects.add(new Disciplina(subject, docente));
        return true;
    }

    public boolean closeSubject(String subject) {
        int position = findSubject(subject);
        if (position >= 0) {
            subjects.remove(subject);
            return true;
        }
        return false;
    }

    public void getSubjectStudents(String subject) {
        int position = findSubject(subject);
        for(Aluno a : subjects.get(position).getStudents()){
            System.out.println(a.getNome());
        }
    }

    public String getSubjectTeacher(String subject) {
        int position = findSubject(subject);
        if (position >= 0) {
            return subjects.get(position).getNameTeacher().getNome();
        }
        return null;
    }

    public int findSubject(String subject) {
        for (int i=0;i<this.subjects.size();i++){
            Disciplina s = this.subjects.get(i);
//            System.out.println("aaaaaa" + s);
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
                   s += "\n\t\tDocente: " + subjects.get(i).getNameTeacher().getNome();
                   s += "\n\t\tAlunos: [";
                   for(Aluno a : subjects.get(i).getStudents()){
                       s += "\n\t\t\t" + a.getId() + " -> " + a.getNome();
                   }
                   s += "\n\t\t]";
               }

               s += "\n}";
        return s;
    }

}

