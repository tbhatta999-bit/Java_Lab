class Fibonacci {
    int n;

    // Constructor
    Fibonacci(int num) {
        n = num;
    }

    // Member function
    void printSeries() {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(10);
        obj.printSeries();
    }
}
