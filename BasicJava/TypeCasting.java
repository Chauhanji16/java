public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        // Change Small Datatype into Larger Datatype
        int a = 10;
        double b = a;
        System.out.println(b);

        // Narrowing Casiting
        // Change Large Datatype into Small Dataty
        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
    }
}
