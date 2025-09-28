abstract  class AbstractCode {
    abstract void shape();
}
class Circle extends AbstractCode{
    @Override
    void shape() {
        System.out.println("Circle class....");
    }
}
class Rectangle extends AbstractCode{
    @Override
    void shape() {
        System.out.println("Rectangle class.....");
    }
}
class main9{
    public static void main(String[] args) {
        AbstractCode Ac = new Circle();
        Ac.shape();
        AbstractCode Ac2 = new Rectangle();
        Ac2.shape();
    }
}
