import java.util.Scanner;

public class Book1 {
    String title;
    String author;
    int price;
    boolean available = true;

    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter price: ");
        int price = scanner.nextInt();

        Book1 book = new Book1(title, author, price);

        book.display();

        System.out.println("\nBorrowing book:");
        book.borrowBook();

        System.out.println("\nAfter borrowing:");
        book.display();
    }
}