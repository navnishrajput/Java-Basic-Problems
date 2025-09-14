import java.util.Random;

public class MatrixOperations {

    // Generate a matrix with random integers between 1 and 9
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(9) + 1;

        return matrix;
    }

    // Display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB)
            throw new IllegalArgumentException("Incompatible matrix sizes for multiplication.");

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    // Transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        return transpose;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0)
            throw new ArithmeticException("Matrix is not invertible.");

        double[][] inverse = new double[2][2];
        inverse[0][0] = m[1][1] / (double) det;
        inverse[0][1] = -m[0][1] / (double) det;
        inverse[1][0] = -m[1][0] / (double) det;
        inverse[1][1] = m[0][0] / (double) det;

        return inverse;
    }

    // Display double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        // Example: 3x3 matrices
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nA x B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        // 2x2 example for inverse
        int[][] C = generateMatrix(2, 2);
        System.out.println("\n2x2 Matrix C:");
        displayMatrix(C);

        System.out.println("\nDeterminant of C: " + determinant2x2(C));

        try {
            System.out.println("\nInverse of C:");
            displayMatrix(inverse2x2(C));
        } catch (ArithmeticException e) {
            System.out.println("Matrix C is not invertible.");
        }
    }
}
