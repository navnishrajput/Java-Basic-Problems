public class Vechile {
    String ownerName;

    String vichleType;
    static  int registrationFee = 500;

    Vechile(String ownerName, String vichleType){
        this.vichleType = vichleType;
        this.ownerName = ownerName;


    }
    void updateRegistration(int fee){
        registrationFee = fee;
        System.out.println("New fee: "+registrationFee);

    }


    void Display(){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vichle type: "+vichleType);
        System.out.println("Registration fee: "+registrationFee);
    }

    public static void main(String[] args) {

        Vechile vechile = new Vechile("Rahul", "Fuel");
        vechile.Display();

    }

}
