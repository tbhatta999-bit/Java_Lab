interface Gross {
    double calcGross();
}

class Employee {
    String name;
}

class Salary extends Employee implements Gross {
    double basic = 10000;

    public double calcGross() {
        return basic + 2000;
    }

    public static void main(String[] args) {
        Salary s = new Salary();
        System.out.println("Gross: " + s.calcGross());
    }
}
