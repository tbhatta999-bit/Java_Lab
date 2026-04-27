import java.util.Scanner;

class MaxOfThree {
    int a, b, c;

    // Constructor
    MaxOfThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Member function
    void findMax() {
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximum number is: " + max);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        MaxOfThree obj = new MaxOfThree(n1, n2, n3);
        obj.findMax();
    }
}
