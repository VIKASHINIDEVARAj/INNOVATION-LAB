import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f", bmi);
        scanner.close();
    }
}
