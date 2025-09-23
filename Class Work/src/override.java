public class override {
    void sound(){
        System.out.println("Animal make sound");
    }

    override(){
        System.out.println("Const");
    }
}
class cat extends  override{


    void sound(){
       // super.override();
        System.out.println("meow");
    }
}
class dog extends override{

    @Override  void sound(){
        System.out.println("bark");
    }
}
class main{
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        cat c = new cat();
        c.sound();
        override animal = new override();
        animal.sound();
    }
}
