// in encapsulation data become private so we use getter setter 
public class Encapsulation {
    public static void main(String[] args) {
          Student s1 = new Student();

        // Setting values
        s1.setName("Rahul");
        s1.setAge(20);

        // Getting values
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
    }


class Student {

    // Private variables
    private String name;
    private int age;
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}



