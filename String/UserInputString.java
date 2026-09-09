  import java.util.*;
public class UserInputString {
    public static void main(String[] args) {
        // if we use nextline then entire line print 
        System.out.println("Provide string contant");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("value : " + str);
        //  if we use  only next then only first letter is print other are left 
        System.out.println("provide second string contant");
        String str1 = sc.next();
        System.out.println("value : " + str1);
        sc.close();
    }
}


