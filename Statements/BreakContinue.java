public class BreakContinue {
    public static void main(String[] args) {
        // Continue condition mean the condition skip the line and continue by next line
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
