import java.util.ArrayList;
import java.util.List;

interface Reservable {
    boolean reserveItem(String borrowerId);
    boolean checkAvailability();
    void cancelReservation();
    String getReservedBy();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;
    private int yearPublished;

    public LibraryItem(String itemId, String title, String author, int yearPublished) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + " | Title: " + title + " | Author: " + author +
                " | Year: " + yearPublished + " | Available: " + (isAvailable ? "Yes" : "No");
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYearPublished() { return yearPublished; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}

class Book extends LibraryItem implements Reservable {
    private String isbn;
    private int pageCount;
    private String genre;
    private String reservedBy;
    private boolean isReserved;

    public Book(String itemId, String title, String author, int yearPublished,
                String isbn, int pageCount, String genre) {
        super(itemId, title, author, yearPublished);
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.genre = genre;
        this.reservedBy = "";
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        if (pageCount > 500) return 21;
        else if (pageCount > 300) return 14;
        else return 7;
    }

    @Override
    public boolean reserveItem(String borrowerId) {
        if (isAvailable() && !isReserved) {
            reservedBy = borrowerId;
            isReserved = true;
            System.out.println("Book reserved successfully by: " + borrowerId);
            return true;
        }
        System.out.println("Cannot reserve book - already reserved or checked out");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable() && !isReserved;
    }

    @Override
    public void cancelReservation() {
        reservedBy = "";
        isReserved = false;
        System.out.println("Reservation cancelled");
    }

    @Override
    public String getReservedBy() {
        return reservedBy;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + " | ISBN: " + isbn + " | Pages: " + pageCount +
                " | Genre: " + genre + " | Loan Duration: " + getLoanDuration() + " days" +
                " | Reserved: " + (isReserved ? "Yes by " + reservedBy : "No");
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String issueNumber;
    private String publisher;
    private int volume;
    private String reservedBy;
    private boolean isReserved;

    public Magazine(String itemId, String title, String author, int yearPublished,
                    String issueNumber, String publisher, int volume) {
        super(itemId, title, author, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
        this.volume = volume;
        this.reservedBy = "";
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public boolean reserveItem(String borrowerId) {
        if (isAvailable() && !isReserved) {
            reservedBy = borrowerId;
            isReserved = true;
            System.out.println("Magazine reserved successfully by: " + borrowerId);
            return true;
        }
        System.out.println("Cannot reserve magazine - already reserved or checked out");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable() && !isReserved;
    }

    @Override
    public void cancelReservation() {
        reservedBy = "";
        isReserved = false;
        System.out.println("Reservation cancelled");
    }

    @Override
    public String getReservedBy() {
        return reservedBy;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + " | Issue: " + issueNumber + " | Publisher: " +
                publisher + " | Volume: " + volume + " | Loan Duration: " + getLoanDuration() + " days" +
                " | Reserved: " + (isReserved ? "Yes by " + reservedBy : "No");
    }
}

class DVD extends LibraryItem implements Reservable {
    private int duration;
    private String format;
    private String language;
    private String reservedBy;
    private boolean isReserved;

    public DVD(String itemId, String title, String author, int yearPublished,
               int duration, String format, String language) {
        super(itemId, title, author, yearPublished);
        this.duration = duration;
        this.format = format;
        this.language = language;
        this.reservedBy = "";
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        if (duration > 120) return 5;
        else return 3;
    }

    @Override
    public boolean reserveItem(String borrowerId) {
        if (isAvailable() && !isReserved) {
            reservedBy = borrowerId;
            isReserved = true;
            System.out.println("DVD reserved successfully by: " + borrowerId);
            return true;
        }
        System.out.println("Cannot reserve DVD - already reserved or checked out");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable() && !isReserved;
    }

    @Override
    public void cancelReservation() {
        reservedBy = "";
        isReserved = false;
        System.out.println("Reservation cancelled");
    }

    @Override
    public String getReservedBy() {
        return reservedBy;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + " | Duration: " + duration + " mins | Format: " +
                format + " | Language: " + language + " | Loan Duration: " + getLoanDuration() + " days" +
                " | Reserved: " + (isReserved ? "Yes by " + reservedBy : "No");
    }
}

class LibraryMember {
    private String memberId;
    private String name;
    private String email;
    private String phone;
    private List<LibraryItem> borrowedItems;

    public LibraryMember(String memberId, String name, String email, String phone) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.borrowedItems = new ArrayList<>();
    }

    public boolean borrowItem(LibraryItem item) {
        if (item.isAvailable() && (!(item instanceof Reservable) ||
                !((Reservable) item).getReservedBy().equals(memberId))) {
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                if (reservable.getReservedBy().equals(memberId)) {
                    reservable.cancelReservation();
                }
            }
            item.setAvailable(false);
            borrowedItems.add(item);
            System.out.println(name + " borrowed: " + item.getTitle() + " for " + item.getLoanDuration() + " days");
            return true;
        }
        System.out.println("Cannot borrow item");
        return false;
    }

    public boolean returnItem(LibraryItem item) {
        if (borrowedItems.contains(item)) {
            item.setAvailable(true);
            borrowedItems.remove(item);
            System.out.println(name + " returned: " + item.getTitle());
            return true;
        }
        return false;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void displayBorrowedItems() {
        System.out.println("\n" + name + "'s Borrowed Items:");
        for (LibraryItem item : borrowedItems) {
            System.out.println(" - " + item.getTitle() + " (Due in " + item.getLoanDuration() + " days)");
        }
    }
}

class Library {
    private List<LibraryItem> items;
    private List<LibraryMember> members;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        initializeData();
    }

    private void initializeData() {
        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", 1925,
                "978-0-7432-7356-5", 180, "Fiction");
        Book book2 = new Book("B002", "War and Peace", "Leo Tolstoy", 1869,
                "978-0-14-044793-4", 1225, "Classic");
        Magazine mag1 = new Magazine("M001", "National Geographic", "Various", 2024,
                "January 2024", "National Geographic Society", 245);
        DVD dvd1 = new DVD("D001", "The Godfather", "Francis Ford Coppola", 1972,
                175, "Blu-ray", "English");
        DVD dvd2 = new DVD("D002", "Inception", "Christopher Nolan", 2010,
                148, "DVD", "English");

        items.add(book1);
        items.add(book2);
        items.add(mag1);
        items.add(dvd1);
        items.add(dvd2);

        LibraryMember member1 = new LibraryMember("MEM001", "John Doe", "john@email.com", "123-456-7890");
        LibraryMember member2 = new LibraryMember("MEM002", "Jane Smith", "jane@email.com", "098-765-4321");

        members.add(member1);
        members.add(member2);
    }

    public void displayAllItems() {
        System.out.println("=== LIBRARY ITEMS CATALOG ===");
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
        }
    }

    public void processLibraryOperations() {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===");

        LibraryMember member1 = members.get(0);
        LibraryMember member2 = members.get(1);

        Book book1 = (Book) items.get(0);
        Book book2 = (Book) items.get(1);
        Magazine mag1 = (Magazine) items.get(2);
        DVD dvd1 = (DVD) items.get(3);

        System.out.println("\n1. Reservation Operations:");
        book1.reserveItem(member1.getMemberId());
        dvd1.reserveItem(member2.getMemberId());

        System.out.println("\n2. Borrowing Operations:");
        member1.borrowItem(book2);
        member2.borrowItem(mag1);

        System.out.println("\n3. Polymorphic Item Processing:");
        for (LibraryItem item : items) {
            System.out.println("\nProcessing: " + item.getTitle());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Available: " + item.isAvailable());

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Reserved: " + (!reservable.getReservedBy().isEmpty()));
                System.out.println("Currently Available: " + reservable.checkAvailability());
            }
        }

        System.out.println("\n4. Member Activities:");
        member1.displayBorrowedItems();
        member2.displayBorrowedItems();

        System.out.println("\n5. Return Operations:");
        member1.returnItem(book2);
        member2.returnItem(mag1);
    }

    public void searchItemsByAuthor(String author) {
        System.out.println("\nSearch Results for Author: " + author);
        for (LibraryItem item : items) {
            if (item.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    public void showAvailableItems() {
        System.out.println("\n=== AVAILABLE ITEMS ===");
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                if (item instanceof Reservable) {
                    Reservable reservable = (Reservable) item;
                    if (reservable.checkAvailability()) {
                        System.out.println(item.getItemDetails());
                    }
                } else {
                    System.out.println(item.getItemDetails());
                }
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.displayAllItems();
        library.processLibraryOperations();
        library.searchItemsByAuthor("Tolstoy");
        library.showAvailableItems();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("INDIVIDUAL ITEM DEMONSTRATION:");

        Book testBook = new Book("TEST001", "Test Book", "Test Author", 2024,
                "978-TEST-001", 350, "Technology");
        testBook.reserveItem("TESTMEM");
        System.out.println(testBook.getItemDetails());
        System.out.println("Loan Duration: " + testBook.getLoanDuration() + " days");
        System.out.println("Available: " + testBook.checkAvailability());
    }
}