import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largest;

        // Using if-else statements to find the largest number
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b>= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Output the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
