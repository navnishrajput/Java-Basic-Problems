public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name of Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer");
    }
}

class Intern extends Employee {
    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
        System.out.println("Role: Intern");
    }
}

class Main7 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Manager("N rR", 101, 75000, 8);
        employees[1] = new Developer("RRR", 102, 65000, "Java");
        employees[2] = new Intern("NNN", 103, 25000, 6);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("-------------------");
        }
    }
}