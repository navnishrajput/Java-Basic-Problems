public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

class Main5 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Buddy", 3);
        animals[1] = new Cat("Whiskers", 2);
        animals[2] = new Bird("Tweety", 1);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}