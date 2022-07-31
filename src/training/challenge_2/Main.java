package training.challenge_2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("1", new Cidadao(1, "Jane", "Doe"));
        Aluno a2 = new Aluno("2", new Cidadao(2, "Carla", "Dolin"));
//        System.out.println(a.toString());
        Docente d = new Docente(1,"John", "Doe", "123");
        Docente d2 = new Docente(1,"Matue", "Collon", "123");
//        System.out.println(d.toString());

        Disciplina dis = new Disciplina("AS001", d);
        Disciplina dis2 = new Disciplina("BC001", d2);
        dis.addNewStudent(a);
        dis.addNewStudent(a2);
//        System.out.println(dis.toString());

        Disciplinas disciplinas = new Disciplinas();
        disciplinas.openSubject("AS001",d);
        disciplinas.addStudent("AS001",a);
        disciplinas.addStudent("AS001",a2);
        disciplinas.openSubject("BC001", d2);
        disciplinas.addStudent("BC001",new Aluno(1,"Lara","Tommis","123"));
//        disciplinas.getSubjectStudents("AS001");
        System.out.println(disciplinas.toString());
//        System.out.println(disciplinas.findSubject("AS001"));
//        System.out.println(disciplinas.findSubject(dis));
    }
}
