import java.util.Scanner;

public class prac16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        reverseNumbers(numbers);
        
        System.out.println("Reversed numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        scanner.close();
    }
    
    public static void reverseNumbers(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
}
