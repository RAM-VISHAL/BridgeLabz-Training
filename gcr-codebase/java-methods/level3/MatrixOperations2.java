import java.util.*;

public class MatrixOperations2{

    // Generate a random square matrix
    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = rand.nextInt(10); // values 0–9
        return matrix;
    }

    // Display matrix
    public static void displayMatrix(String label, double[][] matrix) {
        System.out.println("\n" + label + ":");
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static void displayMatrix(String label, int[][] matrix) {
        System.out.println("\n" + label + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%8d", val);
            System.out.println();
        }
    }

    // Transpose
    public static int[][] transpose(int[][] matrix) {
        int size = matrix.length;
        int[][] transposed = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Determinant of 2x2
    public static double determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3
    public static double determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] cof = new double[3][3];

        cof[0][0] =  m[1][1]*m[2][2] - m[1][2]*m[2][1];
        cof[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cof[0][2] =  m[1][0]*m[2][1] - m[1][1]*m[2][0];

        cof[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cof[1][1] =  m[0][0]*m[2][2] - m[0][2]*m[2][0];
        cof[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cof[2][0] =  m[0][1]*m[1][2] - m[0][2]*m[1][1];
        cof[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cof[2][2] =  m[0][0]*m[1][1] - m[0][1]*m[1][0];

        double[][] adj = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adj[i][j] = cof[j][i] / det;

        return adj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }

        int[][] matrix = generateMatrix(size);
        displayMatrix("Original Matrix", matrix);

        int[][] transposed = transpose(matrix);
        displayMatrix("Transposed Matrix", transposed);

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inverse = inverse2x2(matrix);
            if (inverse != null)
                displayMatrix("Inverse Matrix", inverse);
            else
                System.out.println("Inverse not possible (determinant is zero).");
        } else {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inverse = inverse3x3(matrix);
            if (inverse != null)
                displayMatrix("Inverse Matrix", inverse);
            else
                System.out.println("Inverse not possible (determinant is zero).");
        }
    }
}