import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        boolean prevSpace = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (prevSpace) {
                    count++;
                }
                prevSpace = false;
            } else if (Character.isWhitespace(ch)) {
                prevSpace = true;
            }
        }

        System.out.printf("Number of words that start with capital letters: %d", count);
        input.close();
    }
}
