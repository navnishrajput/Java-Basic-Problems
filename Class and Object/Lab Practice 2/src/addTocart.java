import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int itemQuantity) {
        itemName = name;
        price = itemPrice;
        quantity = itemQuantity;
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + getTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem item = new CartItem();

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        item.addItem(name, price, quantity);

        System.out.println("\n=== Cart Item ===");
        item.displayItem();

        System.out.print("\nRemove item? (yes/no): ");
        scanner.nextLine();
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("yes")) {
            item.removeItem();
            System.out.println("Item removed from cart");
        }
    }
}