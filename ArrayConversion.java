/*[1] Convert 1D Array Into 2D Array

You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.*/


public class ArrayConversion {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];  // Return empty array if it's impossible to create the 2D array
        }

        int[][] result = new int[m][n];  // Initialize the 2D array

        for (int i = 0; i < original.length; i++) {
            int row = i / n;  // Calculate the row index
            int col = i % n;  // Calculate the column index
            result[row][col] = original[i];  // Place the element in the 2D array
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;
        int[][] result = convertTo2DArray(original, m, n);

        // Print the resulting 2D array
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
