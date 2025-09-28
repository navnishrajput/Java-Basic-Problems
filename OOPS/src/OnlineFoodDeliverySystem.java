import java.util.ArrayList;
import java.util.List;

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + " | Price: ₹" + price + " | Quantity: " + quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    protected void setPrice(double price) { this.price = price; }
}

class VegItem extends FoodItem implements Discountable {
    private boolean isOrganic;
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity, boolean isOrganic) {
        super(itemName, price, quantity);
        this.isOrganic = isOrganic;
        this.discountPercentage = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        if (isOrganic) total += total * 0.1;
        total -= total * (discountPercentage / 100);
        return total;
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "% | Organic: " + isOrganic;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + " | " + getDiscountDetails() + " | Total: ₹" + calculateTotalPrice();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private String meatType;
    private double packagingCharge;
    private double discountPercentage;

    public NonVegItem(String itemName, double price, int quantity, String meatType) {
        super(itemName, price, quantity);
        this.meatType = meatType;
        this.packagingCharge = 20.0;
        this.discountPercentage = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total += packagingCharge * getQuantity();
        total -= total * (discountPercentage / 100);
        return total;
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "% | Meat: " + meatType + " | Packaging: ₹" + packagingCharge;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + " | " + getDiscountDetails() + " | Total: ₹" + calculateTotalPrice();
    }
}

class Order {
    private String orderId;
    private List<FoodItem> items;
    private double totalAmount;

    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addItem(FoodItem item) {
        items.add(item);
        totalAmount += item.calculateTotalPrice();
    }

    public void processOrder() {
        System.out.println("Processing Order: " + orderId);
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
        }
        System.out.println("Total Order Amount: ₹" + totalAmount);
    }

    public String getOrderId() { return orderId; }
    public double getTotalAmount() { return totalAmount; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem veg1 = new VegItem("Paneer Tikka", 250, 2, false);
        VegItem veg2 = new VegItem("Organic Salad", 180, 1, true);
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 350, 2, "Chicken");
        NonVegItem nonVeg2 = new NonVegItem("Mutton Curry", 450, 1, "Mutton");

        veg1.applyDiscount(10);
        nonVeg1.applyDiscount(5);

        Order order = new Order("ORD001");
        order.addItem(veg1);
        order.addItem(veg2);
        order.addItem(nonVeg1);
        order.addItem(nonVeg2);

        order.processOrder();
    }
}