interface Department{
    void assignDepartment(String Department);
    void getDepartmentDetails();
}

abstract class Employee {
    int employeeId;
    String name;
    double baseSalary;
    String department;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+employeeId);
        System.out.println("Base Salary: "+baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class FullTimeEmployee extends Employee implements Department{
    private double bonus;

    FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus){
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Department: " + department);
        System.out.println("Type: Full Time");
        System.out.println("------------------------");
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Employee: " + name + ", Department: " + department);
    }
}

class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked){
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Department: " + department);
        System.out.println("Type: Part Time");
        System.out.println("------------------------");
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Employee: " + name + ", Department: " + department);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Ram", 5000, 1000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Babu Ram", 25, 80);
        emp2.assignDepartment("HR");

        FullTimeEmployee emp3 = new FullTimeEmployee(103, "Namak haram", 6000, 1200);
        emp3.assignDepartment("Finance");

        PartTimeEmployee emp4 = new PartTimeEmployee(104, "Hellooo", 30, 60);
        emp4.assignDepartment("Marketing");

        Employee[] employees = {emp1, emp2, emp3, emp4};

        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        System.out.println("=== DEPARTMENT DETAILS ===");
        emp1.getDepartmentDetails();
        emp2.getDepartmentDetails();
        emp3.getDepartmentDetails();
        emp4.getDepartmentDetails();
    }
}