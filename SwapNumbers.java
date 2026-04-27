class SwapNumbers {
    int num;

    // Constructor
    SwapNumbers(int n) {
        num = n;
    }

    // Swap function
    void swap(SwapNumbers obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        System.out.println("Before swap:");
        obj1.display();
        obj2.display();

        obj1.swap(obj2);

        System.out.println("After swap:");
        obj1.display();
        obj2.display();
    }
}
