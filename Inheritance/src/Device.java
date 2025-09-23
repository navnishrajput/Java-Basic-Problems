
public class Device {
    int DeviceID;
    boolean staus= true;
    Device(int DeviceID, boolean staus){
        this.DeviceID = DeviceID;
        this.staus=staus;
    }


}
class Thermostat extends Device{
String temperatureSetting;

 Thermostat(String temperatureSetting, int DeviceID, boolean status){
    super(DeviceID,status);
    this.temperatureSetting = temperatureSetting;
}

void Display(){
    System.out.println("Device id : "+DeviceID);
    System.out.println("status : "+staus);
    System.out.println("temp : "+temperatureSetting);
}

}

class Final {
    public static void main(String[] args) {
        Thermostat T = new Thermostat("Celsius",1233,false);
        T.Display();
    }
}