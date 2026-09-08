public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // By For Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        // By ForEach Loop
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
