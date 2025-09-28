import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
    void setPolicyNumber(String policyNumber);
    String getPolicyNumber();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.isAvailable = true;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + " per day");
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class Car extends Vehicle implements Insurable {
    private int seatingCapacity;
    private String fuelType;
    private String policyNumber;
    private double insuranceRate;

    public Car(String vehicleNumber, double rentalRate, int seatingCapacity, String fuelType) {
        super(vehicleNumber, "Car", rentalRate);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.insuranceRate = 0.1;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRentalRate() * days;
        if (seatingCapacity > 5) baseCost += 500 * days;
        if ("Diesel".equalsIgnoreCase(fuelType)) baseCost += 300 * days;
        return baseCost;
    }

    @Override
    public double calculateInsurance(int days) {
        return calculateRentalCost(days) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance - Policy: " + (policyNumber != null ? policyNumber.substring(0, 4) + "****" : "Not Set") +
                ", Rate: " + (insuranceRate * 100) + "% of rental cost";
    }

    @Override
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    @Override
    public String getPolicyNumber() { return policyNumber; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println(getInsuranceDetails());
    }
}

class Bike extends Vehicle implements Insurable {
    private int engineCapacity;
    private boolean hasHelmet;
    private String policyNumber;
    private double insuranceRate;

    public Bike(String vehicleNumber, double rentalRate, int engineCapacity, boolean hasHelmet) {
        super(vehicleNumber, "Bike", rentalRate);
        this.engineCapacity = engineCapacity;
        this.hasHelmet = hasHelmet;
        this.insuranceRate = 0.05;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRentalRate() * days;
        if (engineCapacity > 150) baseCost += 200 * days;
        if (hasHelmet) baseCost -= 50 * days;
        return Math.max(baseCost, 0);
    }

    @Override
    public double calculateInsurance(int days) {
        return calculateRentalCost(days) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance - Policy: " + (policyNumber != null ? policyNumber.substring(0, 4) + "****" : "Not Set") +
                ", Rate: " + (insuranceRate * 100) + "% of rental cost" +
                ", Helmet Included: " + hasHelmet;
    }

    @Override
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    @Override
    public String getPolicyNumber() { return policyNumber; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println(getInsuranceDetails());
    }
}

class Truck extends Vehicle implements Insurable {
    private double loadCapacity;
    private boolean hasDriver;
    private String policyNumber;
    private double insuranceRate;

    public Truck(String vehicleNumber, double rentalRate, double loadCapacity, boolean hasDriver) {
        super(vehicleNumber, "Truck", rentalRate);
        this.loadCapacity = loadCapacity;
        this.hasDriver = hasDriver;
        this.insuranceRate = 0.15;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRentalRate() * days;
        baseCost += loadCapacity * 1000 * days;
        if (hasDriver) baseCost += 1500 * days;
        return baseCost;
    }

    @Override
    public double calculateInsurance(int days) {
        double baseInsurance = calculateRentalCost(days) * insuranceRate;
        baseInsurance += loadCapacity * 500;
        return baseInsurance;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance - Policy: " + (policyNumber != null ? policyNumber.substring(0, 4) + "****" : "Not Set") +
                ", Rate: " + (insuranceRate * 100) + "% + load-based premium" +
                ", Driver Included: " + hasDriver;
    }

    @Override
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    @Override
    public String getPolicyNumber() { return policyNumber; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println(getInsuranceDetails());
    }
}

class RentalService {
    private List<Vehicle> vehicles;

    public RentalService() {
        this.vehicles = new ArrayList<>();
        initializeVehicles();
    }

    private void initializeVehicles() {
        Car car1 = new Car("CAR001", 1500, 5, "Petrol");
        car1.setPolicyNumber("POLCAR0012024");

        Car car2 = new Car("CAR002", 2000, 7, "Diesel");
        car2.setPolicyNumber("POLCAR0022024");

        Bike bike1 = new Bike("BIKE001", 500, 150, true);
        bike1.setPolicyNumber("POLBIKE0012024");

        Bike bike2 = new Bike("BIKE002", 800, 250, false);
        bike2.setPolicyNumber("POLBIKE0022024");

        Truck truck1 = new Truck("TRUCK001", 5000, 5.0, true);
        truck1.setPolicyNumber("POLTRUCK0012024");

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);
        vehicles.add(truck1);
    }

    public void processRental(int days) {
        System.out.println("=== VEHICLE RENTAL SYSTEM ===");
        System.out.println("Rental Period: " + days + " days\n");

        for (Vehicle vehicle : vehicles) {
            System.out.println("=" .repeat(40));
            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(days);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance(days);
                double totalCost = rentalCost + insuranceCost;

                System.out.println("\n--- Rental Calculation ---");
                System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);
                System.out.println("Insurance Cost: ₹" + insuranceCost);
                System.out.println("TOTAL COST: ₹" + totalCost);
                System.out.println("Full Policy Number: " + insurableVehicle.getPolicyNumber());
            }
            System.out.println();
        }
    }

    public void showInsuranceDetails() {
        System.out.println("=== INSURANCE DETAILS ===");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Vehicle: " + vehicle.getVehicleNumber() + " - " + insurable.getInsuranceDetails());
            }
        }
    }

    public void calculateTotalRevenue(int days) {
        double totalRevenue = 0;
        double totalInsurance = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                totalRevenue += vehicle.calculateRentalCost(days);
                if (vehicle instanceof Insurable) {
                    totalInsurance += ((Insurable) vehicle).calculateInsurance(days);
                }
            }
        }

        System.out.println("=== REVENUE PROJECTION ===");
        System.out.println("Total Rental Revenue: ₹" + totalRevenue);
        System.out.println("Total Insurance Revenue: ₹" + totalInsurance);
        System.out.println("GRAND TOTAL: ₹" + (totalRevenue + totalInsurance));
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        System.out.println("PROCESSING 7-DAY RENTAL:");
        rentalService.processRental(7);

        System.out.println("\n" + "=".repeat(50) + "\n");
        rentalService.showInsuranceDetails();

        System.out.println("\n" + "=".repeat(50) + "\n");
        rentalService.calculateTotalRevenue(7);

        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("INDIVIDUAL VEHICLE DEMONSTRATION:");
        Car testCar = new Car("TEST001", 1800, 5, "Petrol");
        testCar.setPolicyNumber("POLTEST0012024");

        int testDays = 3;
        double rental = testCar.calculateRentalCost(testDays);
        double insurance = testCar.calculateInsurance(testDays);

        System.out.println("Test Car Rental (" + testDays + " days):");
        System.out.println("Rental: ₹" + rental);
        System.out.println("Insurance: ₹" + insurance);
        System.out.println("Total: ₹" + (rental + insurance));
    }
}