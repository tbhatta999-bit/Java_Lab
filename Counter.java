class Counter {
    static int cnt = 0;

    public Counter() {
        increment();
    }

    // Method to increment the static variable
    public void increment() {
        cnt++;
    }
}

public class CounterDriver {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Total objects created: " + Counter.cnt);
    }
}
