package arrays.courses;

import java.util.ArrayList;

public class School {
    private ArrayList<Course> courses;
    public School() {this.courses = new ArrayList<Course>();}

    /*
    Retorna a posicao do objecto
     */
    private int findCourse(Course course){
        return courses.indexOf(courses);
    }
    /*
    Retorna a posiciao da String no array
     */
    private int findCourse(String courseName){
        for (int i=0;i<courses.size();i++){
            Course course = courses.get(i);
            if(course.getName().equalsIgnoreCase(courseName)){
                return i;
            }
        }
        return -1;
    }

    public boolean addNewCourse(Course newCourse){
        if(findCourse(newCourse.getName()) >= 0){
            System.out.println("Curso já adicionado!");
            return false;
        }
        courses.add(newCourse);
        return true;
    }

    public boolean updateCourse(Course currentCourse, Course newCourse){
        int foundPosition = findCourse(currentCourse);
        if(foundPosition < 0){
            System.out.println("Curso não encontrado!");
            return false;
        } else if(findCourse(currentCourse.getName()) != -1){
            System.out.println("Curso já adicionado!");
            return false;
        }
        courses.set(foundPosition, newCourse);
        System.out.println(currentCourse.getName() + " foi actualizado para " + newCourse.getName());
        return true;
    }

    public boolean removeCourse(Course currentCourse){
        int foundPosition = findCourse(currentCourse);
        if (foundPosition < 0){
            System.out.println("Curso não encontrado!");
            return false;
        }
        courses.remove(foundPosition);
        System.out.println("Curso removeido com sucesso!");
        return true;
    }

    public Course queryCourse(String courseName){
        int foundPosition = findCourse(courseName);
        if (foundPosition >= 0){
            return this.courses.get(foundPosition);
        }
        return null;
    }

    public void printCourse(){
        if(courses.size() > 0){
            for (int i =0;i<courses.size();i++){
                System.out.println((i+1) + " - " + courses.get(i).getName() + " | " + courses.get(i).getLevel());
            }
        } else {
            System.out.println("Nenhum curso encontrado!");
        }
    }
}
