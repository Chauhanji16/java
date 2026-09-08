    import java.util.Scanner;
public class MultiplyarrElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             System.out.println("enter the lenght of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("value index for " + i);
            arr[i] = sc.nextInt();
        }

        // mutiplication which is present in arr
        int ans = 1;
        for (int i = 0; i <= n - 1; i++) {
            ans = ans * arr[i];
        }
        {
            System.out.println("multiple of arr value is " + ans);
        }
    }

}


