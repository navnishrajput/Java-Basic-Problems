public class Product {

    String productname;
    int price;
    static int totalProduct;

    Product(String productname,int price){
        this.productname = productname;
        this.price= price;
        totalProduct++;
    }

    void DisplayProduct(){
        System.out.println("product details:");
        System.out.println("product name: "+productname);
        System.out.println("price: "+price);
    }
    public static void totalProduct(){
        System.out.println("Total product in the list:" +totalProduct);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product("TV", 21000);
        Product p3 = new Product("Ac", 5660);
        Product p4 = new Product("SmRTPHONE", 20000);
        Product p5 = new Product("Phone", 20000);

        p1.DisplayProduct();
        p2.DisplayProduct();
        p3.DisplayProduct();
        p4.DisplayProduct();
        p5.DisplayProduct();
        System.out.println();
        System.out.println();
        System.out.println();
        Product.totalProduct();



    }

}
