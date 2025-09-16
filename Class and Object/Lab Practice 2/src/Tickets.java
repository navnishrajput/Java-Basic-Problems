import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber) {
        if(seatNumber <= 0) {
            System.out.println("Invalid seat number!");
            return;
        }

        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = 10.0; // Base price

        if(seatNumber >= 1 && seatNumber <= 20) { // Premium seats
            this.price += 5.0;
        }

        System.out.println("Ticket booked successfully for seat " + seatNumber);
    }

    void displayTicket() {
        System.out.println("=== TICKET ===");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();

        System.out.print("Enter seat number (1-50): ");
        int seat = scanner.nextInt();

        ticket.bookTicket(movie, seat);
        ticket.displayTicket();
    }
}