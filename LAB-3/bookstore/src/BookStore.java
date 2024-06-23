import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
    private List<Book> inventory;

    public BookStore() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void showAllBooks() {
        if (inventory.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : inventory) {
                System.out.println(book);
            }
        }
    }

    public void sellBook(String isbn, int quantity) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                book.sellQuantity(quantity);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void orderBook(String isbn, int quantity) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                book.addQuantity(quantity);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found. Adding a new book to the inventory.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        addBook(new Book(title, author, isbn, price, quantity));
    }

    public static void main(String[] args) {
        BookStore store = new BookStore();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Show all books");
            System.out.println("2. Sell book");
            System.out.println("3. Order book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    store.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to sell: ");
                    String sellIsbn = scanner.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    store.sellBook(sellIsbn, sellQuantity);
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to order: ");
                    String orderIsbn = scanner.nextLine();
                    System.out.print("Enter quantity to order: ");
                    int orderQuantity = scanner.nextInt();
                    store.orderBook(orderIsbn, orderQuantity);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
