// Need to use interface because Inhertance not support multile inheritance
// Implementation keyword is used to add one calss to another class
public class Interface {
    public static void main(String[] args) {
             Animal a = new Dog();
        a.sound();
    }
}
interface Animal {
    void sound();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}



