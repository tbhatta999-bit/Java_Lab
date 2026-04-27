class Book {
    String author, title, publisher;
    double price;
    int stockPosition;

    public Book(String a, String t, double p, String pub, int s) {
        author = a;
        title = t;
        price = p;
        publisher = pub;
        stockPosition = s;
    }

    public static void findHighestPrice(Book[] books) {
        Book expensive = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].price > expensive.price) {
                expensive = books[i];
            }
        }
        System.out.println("The most expensive book is: " + expensive.title + " (Price: " + expensive.price + ")");
    }
}

public class BookShop {
    public static void main(String[] args) {
        Book[] inventory = new Book[10];
        // Sample data for 10 books
        inventory[0] = new Book("Orwell", "1984", 15.0, "Penguin", 5);
        inventory[1] = new Book("Tolkien", "The Hobbit", 25.0, "Harper", 3);
        inventory[2] = new Book("Gaiman", "Sandman", 55.0, "DC", 2); 
        inventory[3] = new Book("Rowling", "Harry Potter", 20.0, "Bloomsbury", 10);
        inventory[4] = new Book("Herbert", "Dune", 18.0, "Chilton", 4);
        inventory[5] = new Book("Asimov", "Foundation", 12.0, "Gnome", 6);
        inventory[6] = new Book("Clarke", "Odyssey", 14.0, "Hutchinson", 3);
        inventory[7] = new Book("King", "The Shining", 22.0, "Doubleday", 5);
        inventory[8] = new Book("Martin", "GoT", 30.0, "Bantam", 8);
        inventory[9] = new Book("Miller", "Circe", 16.0, "Little Brown", 7);

        Book.findHighestPrice(inventory);
    }
}
