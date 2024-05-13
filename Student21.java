import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

public class Student21{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Computer Science", 3);
        Student student2 = new Student("Bob", "Electrical Engineering", 2);

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithm Design");
        Course course3 = new Course("Digital Electronics");

        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student2.registerCourse(course2);
        student2.registerCourse(course3);

        // Retrieving and printing student information
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Semester: " + student1.getSemester());
        System.out.println("Registered Courses:");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }

        System.out.println("\nStudent 2 Details:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Program: " + student2.getProgram());
        System.out.println("Semester: " + student2.getSemester());
        System.out.println("Registered Courses:");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }
    }
}