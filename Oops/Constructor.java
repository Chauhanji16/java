public class Constructor {
    public static void main(String[] args) {
          // Creating object and calling constructor
        Student s1 = new Student("Rahul", 20);
        s1.display();
    }
}
// class
class Student {
    String name;
    int age;
    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

