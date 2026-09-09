// Single Inheritance 
public class SingleInhritance {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Parent class method
        d.bark();  // Child class method
    }
}
// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

