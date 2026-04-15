import java.util.Scanner;

class Item {
    int code;
    double price;

    // Method to accept data
    void getData(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();

        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    // Method to display data
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];  // Array of objects
        double total = 0;

        // Input for 5 objects
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();   // create object
            System.out.println("\nEnter details for item " + (i + 1));
            items[i].getData(sc);
        }

        // Display in tabular form
        System.out.println("\nCode\t\tPrice");
        System.out.println("-----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        // Total price
        System.out.println("-----------------------");
        System.out.println("Total Price = " + total);
    }
}
