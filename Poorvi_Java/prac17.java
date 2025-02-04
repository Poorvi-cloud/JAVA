import java.util.Random;

public class prac17 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(6, 6);
        displayMatrix(matrix);
        
        boolean rowsHaveOddOnes = checkRowsOddOnes(matrix);
        boolean columnsHaveOddOnes = checkColumnsOddOnes(matrix);
        
        if (rowsHaveOddOnes && columnsHaveOddOnes) {
            System.out.println("Every row and column has an odd number of 1's.");
        } else {
            System.out.println("Not every row and column has an odd number of 1's.");
        }
    }
    
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(2); // Generates either 0 or 1
            }
        }
        
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean checkRowsOddOnes(int[][] matrix) {
        for (int[] row : matrix) {
            int countOnes = 0;
            for (int num : row) {
                if (num == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkColumnsOddOnes(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int countOnes = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}

