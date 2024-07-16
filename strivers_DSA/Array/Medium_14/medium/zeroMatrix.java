import java.util.Arrays;

public class zeroMatrix {

    public static void setMatrixZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row needs to be zeroed
        for(int j = 0; j < cols; j++) {
            if(matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column needs to be zeroed
        for (int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use the first row and first column to mark zeros
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out cells based on marks in the first row and column
        for (int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if(firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out the first column if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setMatrixZeroes(matrix);

        System.out.println("Matrix after setting zeros:");
        printMatrix(matrix);
    }
}
