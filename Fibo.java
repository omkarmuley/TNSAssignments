import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");

        // Input validation
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                // Generate Fibonacci sequence
                int a = 0, b = 1;
                System.out.print("Fibonacci sequence: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a + " ");
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
