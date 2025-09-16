import java.util.Scanner;

public class Book {

    String name;
     String title;
    int price;

    public void Book(String name, String title, int price){


        this.name = name;

        this.title = title;

        this.price = price;


    }
    public void display(){
        System.out.println("Author name: "+name);
        System.out.println("Book title: "+title);
        System.out.println("Book price: "+price);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
       Book B1 = new Book();

        System.out.println("enter Author name: ");
        String name = s1.next();


        System.out.println("enter title: ");
        String title = s1.next();
        System.out.println("enter price :");
        int price = s1.nextInt();

        B1.Book(name,title,price);
        B1.display();
    }
}
