// Set C 3

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        int transposeMatric[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered matrix ");
        displayMatrix(matrix, rows, cols);

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposeMatric[i][j] = matrix[j][i];

        System.out.println("Transpose of matrix ");
        displayMatrix(transposeMatric, rows, cols);

        sc.close();
    }

    public static void displayMatrix(int matrix[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
