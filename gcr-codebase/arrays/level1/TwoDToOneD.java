import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        //  Create 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        //  Take user input for matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //  Create 1D array of size rows*cols
        int[] array = new int[rows * cols];
        int index = 0;

        //  Copy elements from 2D to 1D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        //  Print the 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //  Print the 1D array
        System.out.println("\n1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + " = " + array[i]);
        }
    }
}