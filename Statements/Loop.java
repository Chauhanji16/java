public class Loop {
    public static void main(String[] args) {

        // For loop
        // When we know how many time i want to repeat something
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // While Loop
        // If condition is true then Loop print value
        int i = 1;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println();
        // do-While Loop
        // the code execute at list one time either condition is true or false
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 8);
       System.out.println();

        // Use Break in Loop
        for (int num = 1; num <= 10; num++) {
            if (num == 5) {
                break;
            }
            System.out.println(num);
        }
           System.out.println();

        //    
    }
}
