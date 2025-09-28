import java.util.ArrayList;
import java.util.List;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.isAvailable = true;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + " | Driver: " + driverName +
                " | Rate: ₹" + ratePerKm + "/km | Available: " + isAvailable;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}

class Car extends Vehicle implements GPS {
    private String carType;
    private int seatingCapacity;
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String carType, int seatingCapacity) {
        super(vehicleId, driverName, ratePerKm);
        this.carType = carType;
        this.seatingCapacity = seatingCapacity;
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = getRatePerKm() * distance;
        if (seatingCapacity > 4) baseFare += 50;
        if (carType.equals("Premium")) baseFare += 100;
        return baseFare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    @Override
    public String getVehicleDetails() {
        return super.getVehicleDetails() + " | Type: " + carType + " | Seats: " + seatingCapacity +
                " | Location: " + currentLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String bikeType;
    private boolean hasHelmet;
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String bikeType, boolean hasHelmet) {
        super(vehicleId, driverName, ratePerKm);
        this.bikeType = bikeType;
        this.hasHelmet = hasHelmet;
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = getRatePerKm() * distance;
        if (bikeType.equals("Sports")) baseFare += 30;
        if (!hasHelmet) baseFare -= 20;
        return Math.max(baseFare, 50);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    @Override
    public String getVehicleDetails() {
        return super.getVehicleDetails() + " | Type: " + bikeType + " | Helmet: " + hasHelmet +
                " | Location: " + currentLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private int maxPassengers;
    private boolean hasMeter;
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, int maxPassengers, boolean hasMeter) {
        super(vehicleId, driverName, ratePerKm);
        this.maxPassengers = maxPassengers;
        this.hasMeter = hasMeter;
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = getRatePerKm() * distance;
        if (!hasMeter) baseFare += 40;
        baseFare += (maxPassengers * 5);
        return baseFare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    @Override
    public String getVehicleDetails() {
        return super.getVehicleDetails() + " | Max Passengers: " + maxPassengers + " | Meter: " + hasMeter +
                " | Location: " + currentLocation;
    }
}

class RideService {
    private List<Vehicle> vehicles;

    public RideService() {
        this.vehicles = new ArrayList<>();
        initializeVehicles();
    }

    private void initializeVehicles() {
        Car car1 = new Car("CAR001", "Raj Kumar", 15.0, "Sedan", 4);
        Car car2 = new Car("CAR002", "Amit Sharma", 20.0, "Premium", 6);
        Bike bike1 = new Bike("BIKE001", "Suresh Patil", 8.0, "Standard", true);
        Bike bike2 = new Bike("BIKE002", "Mohan Das", 10.0, "Sports", false);
        Auto auto1 = new Auto("AUTO001", "Ravi Kumar", 12.0, 3, true);
        Auto auto2 = new Auto("AUTO002", "Sanjay Roy", 11.0, 4, false);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);
        vehicles.add(auto1);
        vehicles.add(auto2);
    }

    public void calculateFaresForDistance(double distance) {
        System.out.println("=== FARE CALCULATION FOR " + distance + " KM ===");
        for (Vehicle vehicle : vehicles) {
            double fare = vehicle.calculateFare(distance);
            System.out.println(vehicle.getVehicleDetails() + " | Fare: ₹" + fare);
        }
    }

    public void updateVehicleLocations() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                gpsVehicle.updateLocation("Location_" + vehicle.getVehicleId());
            }
        }
    }

    public void showAvailableVehicles() {
        System.out.println("=== AVAILABLE VEHICLES ===");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle.getVehicleDetails());
            }
        }
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideService rideService = new RideService();

        rideService.updateVehicleLocations();
        rideService.showAvailableVehicles();

        System.out.println("\n");
        rideService.calculateFaresForDistance(10.0);

        System.out.println("\n");
        rideService.calculateFaresForDistance(25.5);
    }
}