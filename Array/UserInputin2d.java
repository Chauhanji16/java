import java.util.Scanner;

public class UserInputin2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of row ");
        int n = sc.nextInt();
        System.out.println("enter the length  colomn");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("value for row = " + i + "and  colomn = " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("element in array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // sum of 2D array :
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (i = 0; i < n; i++) {
                    sum = sum + arr[i][j];
                }
            }
            System.out.println("sum of element of array is : " + sum);
        }
        // Multiplication of 2D array :

        int ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (i = 0; i < n; i++) {
                    ans = ans * arr[i][j];
                }
            }
            System.out.println("multiply value of array element  is : " + ans);
        }
        // Max value in 2D array  :
        int Max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (i = 0; i < n; i++) {
                    if (arr[i][j] >= Max) {
                        Max = arr[i][j];
                    }
                }
            }
            System.out.println("the maximum value in array  is : " + Max);

        }
        // Minimum value in 2D array : 
             int Min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (i = 0; i < n; i++) {
                    if (arr[i][j]<= Min) {
                        Min= arr[i][j];
                    }
                }
            }
            System.out.println("the minimum value in array  is : " + Min);

        }
    }
}

