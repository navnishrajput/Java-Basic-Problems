public class Inheritance {

    public void name(){
        System.out.println("Navnish");
    }
}
class Title extends Inheritance{
    public void surname(){
        System.out.println("Kunwar");
    }
}
class Display extends  Inheritance{
    void Fullname(){
        System.out.println("NR");
    }

    public static void main(String []args){
        Display D = new Display();
        D.Fullname();
        D.name();
        Title T = new Title();
        T.name();
        T.surname();

    }
}



