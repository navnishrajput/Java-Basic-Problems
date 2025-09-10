import java.util.Scanner;

public class Arth {
    int a;
    int b;

    public void  Add(int a , int b){
        this.a = a;
        this.b = b;
        int c = a+b;
        System.out.println("Add: "+c);

    }
    public void  Sub(int a , int b){
        this.a = a;
        this.b = b;
        int c = a-b;
        System.out.println("Sub: "+c);

    }
    public void  Mul(int a , int b){
        this.a = a;
        this.b = b;
        int c = a*b;
        System.out.println("Mul: "+c);

    }
    public void  Divide(int a , int b){
        this.a = a;
        this.b = b;
        int c = a/b;
        System.out.println("Divide: "+c);

    }


    public static void main(String args[]){
        Arth A = new Arth();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter First number");
        int b = sc.nextInt();
        System.out.println("Enter Number for perform task: ");
        System.out.println("1 Add");
        System.out.println("2 Divide");
        System.out.println("3 Sub");
        System.out.println("4 Mul");

        int Num = sc.nextInt();
        switch (Num){
            case 1:{
                A.Add(a,b);
                break;
            }
            case 2:{
                A.Divide(a,b);
                break;
            }
            case 3:{
                A.Sub(a,b);
                break;
            }
            case 4:{
                A.Mul(a,b);
                break;
            }
            default:
                System.out.println("bhaiii limit reh.....");
        }

    }
}