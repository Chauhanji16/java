import java.util.Scanner;
public class StringMethod{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        if (str.length() > 0) {
            System.out.println("First character: " + str.charAt(0));
        }

        System.out.println("Contains 'a': " + str.contains("a"));
        System.out.println("Replace a with x: " + str.replace("a", "x"));
        System.out.println("Substring: " + (str.length() >= 3 ? str.substring(0, 3) : str));

         sc.close();
    }
}


