package arrays.courses;

public class Course {
    private String name;
    private String level;

    public Course(String name, String nivel) {
        this.name = name;
        this.level = nivel;
    }

    public static Course createCourse(String name, String level){
        return new Course(name, level);
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}
