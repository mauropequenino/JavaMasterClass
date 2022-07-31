package arrays.courses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static School school = new School();

    public static void main(String[] args) {
        boolean quit = false;
        printOptions();

        while (!quit){
            System.out.print("Escolha a sua opção: ");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    school.printCourse();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    updateCourse();
                    break;
                case 4:
                    removeCourse();
                    break;
                case 5:
                    queryCourse();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    public static void addCourse() {
        System.out.print("Insira o nome do curso: ");
        String name = sc.nextLine();
        System.out.print("Insira o nivel: ");
        String level = sc.nextLine();
        Course course = Course.createCourse(name, level);
        if (school.addNewCourse(course)){
            System.out.println("Curso adicionado com sucesso!");
        } else {
            System.out.println("ERRO | Não foi possível adicionar o curso");
        }
    }

    public static void updateCourse() {
        System.out.print("Insira o nome do curso: ");
        String courseName = sc.nextLine();
        Course existingCourse = school.queryCourse(courseName);
        if (existingCourse == null){
            System.out.println("Curso não encontrado");
            return;
        }

        System.out.print("Insira o nome do curso: ");
        String newCourseName = sc.nextLine();
        System.out.print("Insira o nome do curso: ");
        String newCourseLevel = sc.nextLine();
        Course newCourse = Course.createCourse(newCourseName, newCourseLevel);
        if (school.updateCourse(existingCourse, newCourse)){
            System.out.println("Actualizado com sucesso!");
        } else {
            System.out.println("ERRO | Não foi possível actualizar o curso!");
        }
    }

    public static void removeCourse() {
        System.out.print("Insira o nome do curso: ");
        String courseName = sc.nextLine();
        Course existingCourse = school.queryCourse(courseName);
        if (existingCourse == null){
            System.out.println("Curso não encontrado");
            return;
        }
        school.removeCourse(existingCourse);
    }

    public static void queryCourse(){
        System.out.print("Insira o nome do curso: ");
        String courseName = sc.nextLine();
        Course existingCourse = school.queryCourse(courseName);
        if (existingCourse == null){
            System.out.println("Curso não encontrado");
            return;
        }
        System.out.println("\nCurso: " + existingCourse.getName());
        System.out.println("Nivel: " + existingCourse.getLevel());
    }

    public static void printOptions(){
        System.out.println("\tPress: ");
        System.out.println("""
                0 - Terminar 
                1 - Exibir todos os cursos
                2 - Adicionar
                3 - Editar
                4 - Remover
                5 - Pesquisar
                6 - Exibir opções
                """);
    }
}
