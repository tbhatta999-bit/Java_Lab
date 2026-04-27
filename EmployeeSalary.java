import java.util.Scanner;

class EmployeeSalary {
    int emp_no;
    String name, department;
    double basic_pay, da, hra, gross_salary;

    public EmployeeSalary(int id, String n, String d, double bp) {
        emp_no = id;
        name = n;
        department = d;
        basic_pay = bp;
        // Calculation Logic (e.g., DA = 40%, HRA = 20%)
        da = basic_pay * 0.40;
        hra = basic_pay * 0.20;
        gross_salary = basic_pay + da + hra;
    }

    public void display() {
        System.out.println(name + " | Gross: " + gross_salary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        EmployeeSalary[] employees = new EmployeeSalary[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID, Name, Dept, Basic Pay:");
            employees[i] = new EmployeeSalary(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        }

        EmployeeSalary highest = employees[0];
        for (EmployeeSalary e : employees) {
            if (e.gross_salary > highest.gross_salary) highest = e;
        }

        System.out.println("\nEmployee with Highest Gross Salary:");
        highest.display();
    }
}
