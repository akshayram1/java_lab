package programs;

/*21. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses. */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}

public class AddRemoveCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a new student
        Student student = new Student(name, grade);

        // Prompt for adding courses
        String course;
        char choice;

        do {
            System.out.print("Enter course name to add: ");
            course = scanner.nextLine();
            student.addCourse(course);

            System.out.print("Do you want to add another course? (Y/N): ");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Prompt for removing courses
        do {
            System.out.print("Enter course name to remove: ");
            course = scanner.nextLine();
            student.removeCourse(course);

            System.out.print("Do you want to remove another course? (Y/N): ");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        scanner.close();

        // Display student details
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());
    }
}
