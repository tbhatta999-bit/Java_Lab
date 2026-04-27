class Employee {
    private String name;
    private String department;
    private double salary;
    static String companyName = "TechCorp Inc.";

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + " | Dept: " + department + 
                           " | Salary: $" + salary + " | Company: " + companyName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Alice", "HR", 50000);
        staff[1] = new Employee("Bob", "IT", 60000);
        staff[2] = new Employee("Charlie", "Sales", 45000);
        staff[3] = new Employee("Diana", "IT", 65000);
        staff[4] = new Employee("Edward", "Marketing", 52000);

        System.out.println("--- Employee Records ---");
        for (Employee e : staff) {
            e.display();
        }
    }
}
