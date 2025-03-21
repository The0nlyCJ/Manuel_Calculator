import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform calculations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println(); // Blank line as per sample
        
        // Display results with formatting
        printFormattedResult("Addition", addition);
        printFormattedResult("Subtraction", subtraction);
        printFormattedResult("Multiplication", multiplication);
        printFormattedResult("Division", division);
        
        scanner.close();
    }
    
    // Helper method to format integer or decimal results
    private static void printFormattedResult(String operation, double result) {
        if (result == (int) result) {
            System.out.printf("%s: %d%n", operation, (int) result);
        } else {
            System.out.printf("%s: %.2f%n", operation, result);
        }
    }
}