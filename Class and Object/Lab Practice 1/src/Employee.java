import java.util.Scanner;

public class Employee {


    String name;
    int id;
    int salary;

    public void Emp(String name, int id, int salary){


        this.name = name;

        this.id = id;

        this.salary = salary;


    }
    public void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("enter employee name: ");
        String name = s1.next();


        System.out.println("enter id: ");
        int id = s1.nextInt();
        System.out.println("enter salary :");
        int salary = s1.nextInt();

        emp.Emp(name,id,salary);
        emp.display();
    }
}
