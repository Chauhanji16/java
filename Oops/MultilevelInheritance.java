public class MultilevelInheritance {
        public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // Animal method
        p.bark();  // Dog method
        p.play();  // Puppy method
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
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}
