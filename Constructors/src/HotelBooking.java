public class HotelBooking {

    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        this.guestName = "Rahul";
        this. roomType = "Ac";
        this.nights = 2;
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking obj){
        this.guestName = obj.guestName;
        this.roomType = obj.roomType;
        this.nights = obj.nights;
    }

    void Display(){
        System.out.println("Guest name: "+guestName);
        System.out.println("Room type: "+roomType);
        System.out.println("Night stay: "+nights);
    }

    public static void main(String[] args) {
        HotelBooking HB = new HotelBooking("Nav", "ac",3);
        HotelBooking Hb1 = new HotelBooking(HB);
        HotelBooking hb2 = new HotelBooking();
        System.out.println("Default");
        hb2.Display();
        System.out.println("paramter");

        HB.Display();
        System.out.println("copy");
        Hb1.Display();
    }
}
