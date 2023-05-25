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
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course '" + course + "' removed.");
        } else {
            System.out.println("Course '" + course + "' is not present.");
        }
    }
}

class StudentCourseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        Student student = new Student(name, grade);
        System.out.println("Student details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        while (true) {
            System.out.print("Enter 'add' to add a course, 'remove' to remove a course, or 'quit' to exit: ");
            String input = scanner.nextLine();
            if (input.equals("add")) {
                System.out.print("Enter course name to add: ");
                String course = scanner.nextLine();
                student.addCourse(course);
                System.out.println("Course '" + course + "' added.");
            } else if (input.equals("remove")) {
                System.out.print("Enter course name to remove: ");
                String course = scanner.nextLine();
                student.removeCourse(course);
            } else if (input.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println("Final student details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());
        scanner.close();
    }
}
