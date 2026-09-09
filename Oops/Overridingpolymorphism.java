// In overriding  different class  contain the same method with same parameter 


public class Overridingpolymorphism {
        public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
// Child class 3
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}
