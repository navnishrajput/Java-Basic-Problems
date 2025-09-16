public class MobilePhone {

    String brand;
    String model;
    int pirce;

    void detail(String brand, String model, int pirce){
        this.brand = brand;
        this.model = model;
        this.pirce = pirce;
    }
    void display(){
        System.out.println("Mobile brand: "+brand);
        System.out.println("Mobile model: "+model);
        System.out.println("Mobile price: "+pirce);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        System.out.println();
        phone.detail("Pixel","8",120000);
        phone.display();
        System.out.println();
        phone.detail("google","pro",120000);
        phone.display();
        System.out.println();
        phone.detail("Samsung","ultra 24",10000);
        phone.display();
    }



}
