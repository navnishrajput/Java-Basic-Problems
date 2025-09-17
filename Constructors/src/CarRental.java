import java.util.Scanner;

public class CarRental {

    String customerName;
    String cardModel;
    int rentalDays;
    int price= 500;
    CarRental(String customerName, String cardModel, int rentalDays){
        this.customerName = customerName;
        this.cardModel = cardModel;
        this.rentalDays = rentalDays;
        Calculateprice();

    }

    int Calculateprice(){
        return rentalDays*price;
    }
    void Display(){
        System.out.println("User name: "+customerName);
        System.out.println("model: "+cardModel);
        System.out.println("Price: "+Calculateprice());
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = s1.nextLine();
        System.out.println("ENTER MODEL: ");
        String model = s1.nextLine();
        System.out.println("Enter days: ");
        int days = s1.nextInt();

        CarRental car = new CarRental(name,model,days);
        car.Display();
    }
}
