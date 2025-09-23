public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max speed of vehicle: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int maxLoadCapacity;

    Truck(int maxSpeed, String fuelType, int maxLoadCapacity) {
        super(maxSpeed, fuelType);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Max load capacity: " + maxLoadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    int gear;

    Motorcycle(int maxSpeed, String fuelType, int gear) {
        super(maxSpeed, fuelType);
        this.gear = gear;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of gears: " + gear);
    }
}

class V {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(180, "Petrol", 6);

        System.out.println("Displaying all vehicle information:");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("----------------------");
        }
    }
}