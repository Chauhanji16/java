// When we make abstract class then before class we use Abstract keyword
// also make abstract method but abstract mthod have no body
// We can not create directely obj of Abstrac class
public class Abstraction {
    public static void main(String[] args) {  
        Animal d = new Dog();
        d.sound();
        d.eat();
    }
}

abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


