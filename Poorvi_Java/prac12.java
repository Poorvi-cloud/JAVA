import java.util.Scanner;

public class prac12 {
    public static void main(String[] args) {
        String plateNumber = generatePlateNumber();
        System.out.println("Generated Plate Number: " + plateNumber);
    }

    public static String generatePlateNumber() {
        Scanner scanner = new Scanner();
        StringBuilder plateNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char scannerChar = (char) (scanner.nextInt(26) + 'A');
            plateNumber.append(scannerChar);
        }

        for (int i = 0; i < 4; i++) {
            int scannerDigit = scanner.nextInt(10);
            plateNumber.append(scannerDigit);
        }

        return plateNumber.toString();
    }
}
