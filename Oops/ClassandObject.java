public class ClassandObject {
    public static void main(String[] args) {
        // creating object of student class
        Student s1 = new Student();
        // s1 is the object
        s1.name = "Rahul";
        s1.age = 20;
        s1.display();
    }
}

// student is  Class
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
