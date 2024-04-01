import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee extends Person {
    private int emp_id;
    private double salary;

    public Employee(String name, LocalDate dob, int emp_id, double salary) {
        super(name, dob);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {

        LocalDate dob = LocalDate.parse("1990-05-15", DateTimeFormatter.ISO_DATE);
        Employee emp = new Employee("John Doe", dob, 1001, 50000.00);
        emp.displayEmployeeDetails();
    }
}