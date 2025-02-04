import java.util.Random;

public class prac11 {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("First 100 random integers between 1 and 49:");
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(49) + 1; // Generate random integer between 1 and 49
            System.out.println(randomNumber);
        }
    }
}
