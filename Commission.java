import java.util.*;

class Commission {
    double sales;

    Commission(double s) {
        sales = s;
    }

    double commission() {
        if (sales >= 100000)
            return sales * 0.10;
        else if (sales >= 50000)
            return sales * 0.05;
        else if (sales >= 30000)
            return sales * 0.03;
        else
            return 0;
    }
}

public class DemoCommission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales: ");
        double s = sc.nextDouble();

        if (s < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission c = new Commission(s);
            System.out.println("Commission = " + c.commission());
        }
    }
}
