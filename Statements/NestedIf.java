public class NestedIf {
    public static void main(String[] args) {
        int age = 22;
        boolean citizen = true;
        if (age >= 18) {
            if (citizen) {
                System.out.println("Eligible to vote");

            }
        }
    }
}
