import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows]; // Transposed matrix

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Compute transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, rows, cols);

        // Display the transposed matrix
        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose, cols, rows);

        scanner.close();
    }

    // Method to print the matrix
    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
