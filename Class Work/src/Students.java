public class Students {
    String name;
    int roll;
    Students(String name, int roll){
        this.name = name;
        this.roll = roll;


    }
    void Display(){
        System.out.println("Name: " +name);
        System.out.println("Name: " +roll);
    }

    public static void main(String[] args) {
        Students S1 = new Students("Navnihs", 101);
        S1.Display();
    }
}
