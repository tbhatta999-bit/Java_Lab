import java.util.*;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";
    void printDept();
}

class Hostel {
    String hostelName, location;
    int rooms;

    void getHostel(Scanner sc) {
        hostelName = sc.next();
        location = sc.next();
        rooms = sc.nextInt();
    }

    void printHostel() {
        System.out.println(hostelName + " " + location + " " + rooms);
    }
}

class Student extends Hostel implements Department {
    String name, subject;
    int regNo;
    double marks;

    void getData(Scanner sc) {
        name = sc.next();
        regNo = sc.nextInt();
        subject = sc.next();
        marks = sc.nextDouble();
        getHostel(sc);
    }

    void printData() {
        System.out.println(name + " " + regNo + " " + subject + " " + marks);
        printHostel();
        printDept();
    }

    public void printDept() {
        System.out.println(deptName + " " + deptHead);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1: s.getData(sc); break;
                case 2:
                    int r = sc.nextInt();
                    if (r == s.regNo) System.out.println("Migrated");
                    else System.out.println("Not found");
                    break;
                case 3: s.printData(); break;
                default: return;
            }
        }
    }
}
