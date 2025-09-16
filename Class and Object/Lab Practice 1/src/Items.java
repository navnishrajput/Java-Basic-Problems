import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = scanner.nextLine();

        System.out.print("Enter Price: ");
        item.price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.println();
        item.displayDetails();
        System.out.println("Total Pirce: "+item.calculateTotalCost(quantity));
    }
}
