class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------------");
    }
}

class EBook extends Book2 {
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookInfo() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // public - directly accessible
        System.out.println("Title: " + title); // protected - accessible in subclass
        System.out.println("Author: " + getAuthor()); // private - accessible via public method
        System.out.println("Format: " + fileFormat);
        System.out.println("----------------------------");
    }

    public void updateTitle(String newTitle) {
        title = newTitle; // protected member can be modified in subclass
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Book2 book = new Book2("978-1234567890", "Java Programming", "John Doe");
        EBook ebook = new EBook("978-0987654321", "Python Basics", "Jane Smith", "PDF");

        System.out.println("=== Book Information ===");
        book.displayInfo();

        System.out.println("=== E-Book Information ===");
        ebook.displayEBookInfo();

        System.out.println("=== Accessing and Modifying Author ===");
        System.out.println("Current Author: " + ebook.getAuthor());
        ebook.setAuthor("Jane Johnson");
        System.out.println("Updated Author: " + ebook.getAuthor());

        System.out.println("=== Demonstrating Protected Access ===");
        System.out.println("Original Title: " + ebook.title);
        ebook.updateTitle("Python Programming Basics");
        System.out.println("Updated Title: " + ebook.title);

        System.out.println("=== Demonstrating Public Access ===");
        System.out.println("ISBN: " + ebook.ISBN);

        System.out.println("=== Final E-Book Details ===");
        ebook.displayEBookInfo();
    }
}