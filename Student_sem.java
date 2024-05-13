import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private String program;
    private int semester;
    private Map<String, Integer> courseMarks;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courseMarks = new HashMap<>();
    }

    public void registerMarks(String courseName, int marks) {
        courseMarks.put(courseName, marks);
    }

    public int getMarksForCourse(String courseName) {
        return courseMarks.getOrDefault(courseName, 0);
    }

    public boolean hasFailedInAnyCourse() {
        for (int marks : courseMarks.values()) {
            if (marks < 40) {
                return true;
            }
        }
        return false;
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
}

public class Student_sem {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Computer Science", 3);
        Student student2 = new Student("Bob", "Electrical Engineering", 2);

        student1.registerMarks("Data Structures", 60);
        student1.registerMarks("Algorithm Design", 35);
        student2.registerMarks("Algorithm Design", 45);
        student2.registerMarks("Digital Electronics", 30);

        // Retrieving marks and checking failures
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Semester: " + student1.getSemester());
        System.out.println("Marks for Algorithm Design: " + student1.getMarksForCourse("Algorithm Design"));
        if (student1.hasFailedInAnyCourse()) {
            System.out.println("Student 1 has failed in one or more courses.");
        } else {
            System.out.println("Student 1 has passed all courses.");
        }

        System.out.println("\nStudent 2 Details:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Program: " + student2.getProgram());
        System.out.println("Semester: " + student2.getSemester());
        System.out.println("Marks for Digital Electronics: " + student2.getMarksForCourse("Digital Electronics"));
        if (student2.hasFailedInAnyCourse()) {
            System.out.println("Student 2 has failed in one or more courses.");
        } else {
            System.out.println("Student 2 has passed all courses.");
        }
    }
}