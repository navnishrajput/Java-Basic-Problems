interface  Taxable{
    double calculateTax();
    void getTaxDetails();
}

abstract class Product{
    private int productId;
    double price;
    private String Name;

    Product(int productId,double price, String Name){
        this.productId = productId;
        this.Name = Name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    abstract double calculateDiscount();

    void Display(){
        System.out.println("Product id: "+productId);
        System.out.println("NAme: "+Name);
        System.out.println("Price: "+price);
    }
}

abstract class Electronics extends Product implements Taxable{
    int discount;

    Electronics(int productId,double price, String Name ,int discount){
        super(productId,price,Name);
        this.discount = discount;

    }


    double calculateDiscount() {
        return getPrice()*0.10;
    }
    void Display(){
        super.Display();
        System.out.println("Discount: "+calculateDiscount());
    }


}
abstract class Clothing extends Product implements Taxable{
    private String size;
    private String fabric;




    Clothing(int productId,double price, String Name,String size,String fabric){
        super(productId,price,Name);
        this.size = size;
        this.fabric = fabric;
    }

    void Display(){
        super.Display();
        //System.out.println("Discount: "+calculateDiscount());

        System.out.println("Size: "+size);
        System.out.println("Fabric: "+fabric);
    }


}
abstract class Groceries extends Product implements Taxable{
    private String expiryDate;
    Groceries(int productId,double price, String Name,String expiryDate){
        super(productId,price,Name);
        this.expiryDate = expiryDate;
    }
    void Display(){
        super.Display();
        System.out.println("Expiry Date: "+expiryDate);
    }
}




public class Ecommerce {

    public static void main(String[] args) {
        Product p = new
    }
}
