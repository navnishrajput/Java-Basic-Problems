public class Animal {
    void sound(){
        System.out.println("Make sound");
    }
    void Animal(){
        System.out.println("Const");
    }
}
class Dog extends Animal{
    void sound(){
        super.Animal();
        System.out.println("Bark");
    }
}
class Final{
    public static void main(String[] args) {
        Dog D = new Dog();
        D.sound();

    }
}