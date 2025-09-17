public class Person {

    String name;
    int age;
    int Birthyear;

    Person(String name, int age, int Birthyear){

        this.name = name;
        this.age = age;
        this.Birthyear = Birthyear;

    }

    Person(Person obj){
        this.name = obj.name;
        this.age = obj.age;
        this.Birthyear = obj.Birthyear;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Birthyear: "+Birthyear);
    }

    public static void main(String[] args) {
        Person p1 = new Person("N",23,20003);
        Person p2 = new Person(p1);
        p1.Display();
        p2.Display();
    }


}
