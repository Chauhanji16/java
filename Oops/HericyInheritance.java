public class HericyInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Parent method
        d.bark();  // Dog method

        Cat c = new Cat();

        c.eat();   // Parent method
        c.meow();  // Cat method
    }
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

