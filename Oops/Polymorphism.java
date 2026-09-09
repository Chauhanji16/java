// In polymorphism we can create different claas but all class have 
// same method and same parametr vale
public class Polymorphism {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
