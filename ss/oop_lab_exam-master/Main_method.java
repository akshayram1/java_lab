package programs;

class Per1 {
    private String firstName;
    private String lastName;
    public Per1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employee_1 extends Per1 {
    private int employeeId;
    private String jobTitle;
    public Employee_1(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
// Main.java
// Main class
public class Main_method {
    public static void main(String[] args) {
      Employee_1 employee1 = new Employee_1("Kortney", "Rosalee", 4451, "HR Manager");
      System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
	  Employee_1 employee2 = new Employee_1("Junior", "Philipa", 4452, "Software Manager");
      System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}
