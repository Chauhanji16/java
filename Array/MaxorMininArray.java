import java.util.Scanner;

public class MaxorMininArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Max element in array
        int arr[] = new int[5];
        int n = arr.length;
        {
            System.out.println("length of arr is " + n);
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("value index for " + i);
            System.out.println("Enter the Element");
            arr[i] = sc.nextInt();
        }
        int Max = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] >= Max) {
                Max = arr[i];
            }
        }
        System.out.println("the maximum value in array is " + Max);
       System.out.println();
        
 // minimum element in array
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("value index for " + i);
            System.out.println("Enter the Element");
            arr[i] = sc.nextInt();
        }
        int Min = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] <= Min) {
                Min = arr[i];
            }
        }
        System.out.println("the minimum value in array is " + Min);
    }
}
