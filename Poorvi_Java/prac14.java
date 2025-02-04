import java.util.Scanner;

public class prac14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        System.out.print("Smallest factors of " + num + " are: ");
        smallestFactors(num);
    }
    
    public static void smallestFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
