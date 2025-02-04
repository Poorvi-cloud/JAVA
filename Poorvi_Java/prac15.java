import java.util.Scanner;

public class prac15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
    
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
