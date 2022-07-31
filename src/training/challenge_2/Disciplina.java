package training.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String subjectName;
    private Docente nameTeacher;
    private List<Aluno> students;

    public Disciplina(String subjectName, Docente teacher) {
        this.subjectName = subjectName;
        this.nameTeacher = teacher;
        students = new ArrayList<Aluno>();
    }
    public int findStudent(String nome) {
        for(int i = 0; i< students.size(); i++){
            Aluno aluno = students.get(i);
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }

    private int findStudent(Aluno aluno) {
        return this.students.indexOf(aluno);
    }

    public String getAluno(String nameStudent){
        int position = this.findStudent(nameStudent);
        if(position >= 0) {
            return this.students.get(position).getNome();
        }
        return null;
    }

    public boolean addNewStudent(Aluno aluno) {
        if(this.findStudent(aluno.getNome()) >= 0) {
            System.out.println("O aluno ja foi adicionado!");
            return false;
        }
        this.students.add(aluno);
        return true;
    }

    public boolean removeStudent(Aluno aluno) {
       int position = findStudent(aluno);
       if(position >= 0) {
           this.students.remove(position);
           return true;
       }
       return false;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public Docente getNameTeacher() {
        return nameTeacher;
    }

    public void getStudents() {
        System.out.println("Alunos: ");
        for (int i=0;i<this.students.size();i++){
            System.out.println((i+1) + " -> " + students.get(i).getNome());
        }
    }
}