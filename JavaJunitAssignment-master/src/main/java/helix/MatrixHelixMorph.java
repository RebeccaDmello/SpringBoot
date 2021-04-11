package helix;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {
        int rows = inMatrix.length;
        int cols = inMatrix[0].length;

        int[] a = new int[rows * cols];
        int[][] matrix = new int[rows][cols];

        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1,
                left = 0, right = cols - 1,
                index = 0;

        // Defining the direction in which the array is to be traversed.
        int dir = 1;

        while (top <= bottom && left <= right) {
            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    a[index] = inMatrix[top][i];
                    index++;
                }
                ++top;
                dir = 2;
            } else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    a[index] = inMatrix[i][right];
                    index++;
                }
                --right;
                dir = 3;
            } else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    a[index] = inMatrix[bottom][i];
                    index++;
                }
                --bottom;
                dir = 4;
            } else if (dir == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    a[index] = inMatrix[i][left];
                    index++;
                }
                ++left;
                dir = 1;
            }
        }

        index = 0;
        for (int mr = 0; mr < matrix.length; mr++) {
            for (int mc = 0; mc < matrix[0].length; mc++) {
                matrix[mr][mc] = a[index];
                index++;
            }
        }
        return matrix;
    }

    public static void main(String args[]) {
        int[][] a = { {19, 20, 21, 22, 100, 24}, {25, 26, 277, 28, 29, 30}, {31, 32, 233, 34, 35, 36} };
        int[][] res = helix(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}