import java.util.Scanner;

public class prac13 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        String decimalStr = scanner.nextLine();

        // Split the decimal number into integer and fractional parts
        String[] parts = decimalStr.split("\\.");
        int integerPart = Integer.parseInt(parts[0]);
        int fractionalPart = Integer.parseInt(parts[1]);

        // Find the number of digits in the fractional part to calculate denominator
        int numberOfDigits = parts[1].length();
        int denominator = (int) Math.pow(10, numberOfDigits);

        // Calculate numerator
        int numerator = integerPart * denominator + fractionalPart;

        // Find the greatest common divisor (gcd) of numerator and denominator
        int gcd = gcd(numerator, denominator);

        // Simplify the fraction by dividing both numerator and denominator by their gcd
        numerator /= gcd;
        denominator /= gcd;

        // Display the fraction
        System.out.println("Fraction representation: " + numerator + "/" + denominator);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the greatest common divisor (gcd) of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
