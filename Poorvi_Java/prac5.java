import java.util.Scanner;

public class prac5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Find the maximum number
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is " + max);
    }
}
