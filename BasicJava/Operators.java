public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational Operators
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Assigement Operators
        a += 5; // a = a + 5
        a -= 2; // a = a - 2
        a *= 2; // a = a * 2
        a /= 2; // a = a / 2

        // Inceament and Decrement Operators
        System.out.println(a++); // 10
        System.out.println(++a); // 12
        System.out.println(a--); // 12
        System.out.println(--a); // 10

        // Logical Operators
        int age = 22;
        System.out.println(age > 18 && age < 30);
        System.out.println(age < 18 || age > 20);
        System.out.println(!(age > 18));
    }
}
