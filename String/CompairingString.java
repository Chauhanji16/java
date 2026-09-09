public class CompairingString {
    public static void main(String[] args) {
        // For( ==) Compaire
        // it refers the adderss
        String n1 = "Anuj";
        String n2 = "Anuj";
        if (n1 == n2) {
            System.out.println("Both Are same");
        } else {
            System.out.println("Both ar not same");
        }
        // For (.equal) Compair
        // It is case senstive
        String n3 = "ANuj";
        String n4 = "Anuj";
        if (n3.equals(n4)) {
            System.out.println("Both Are same");
        } else {
            System.out.println("Both ar not same");
        }
        // For (.equalIgnorecase)
        // It is not case senstive
        String n5 = "ANUJ";
        String n6 = "Anuj";
        if (n5.equalsIgnoreCase(n6)) {
            System.out.println("Both Are same");
        } else {
            System.out.println("Both ar not same");
        }
    }
}


