package helix;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MatrixHelixMorphTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1
     * @param matrix2
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test1x1() {
        int[][] inMatrix  = { {1} };
        int[][] expOutput = { {1} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    // ADD TESTS TO CHECK PARTITIONS
    @Test
    public void test3x3() {
        int[][] inMatrix  = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] expOutput = { {9, 8, 7},
                {4, 1, 2},
                {3, 6, 5} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test4x4() {
        int[][] inMatrix  = { {9, 8, 7, 6}, {5, 6, 4, 3}, {2, 1, 0, 9}, {1, 3, 1, 16} };
        int[][] expOutput = { {9, 8, 7, 6},
                {3, 9, 16, 1},
                {3, 1, 2, 5},
                {6, 4, 0, 1} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test5x4() {
        int[][] inMatrix  = { {1, 2, 3, 4}, {5, 6, 7, 8}, {11, 12, 13, 14}, {16, 17, 18, 19}, {21, 22, 23, 24} };
        int[][] expOutput = {{1, 2, 3, 4},
                {8, 14, 19, 24},
                {23, 22, 21, 16},
                {11, 5, 6, 7},
                {13, 18, 17, 12} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test3x6() {
        int[][] inMatrix  = { {19, 20, 21, 22, 100, 24}, {25, 26, 277, 28, 29, 30}, {31, 32, 233, 34, 35, 36} };
        int[][] expOutput = {
                {19, 20, 21, 22, 100, 24},
                {30, 36, 35, 34, 233, 32},
                {31, 25, 26, 277, 28, 29} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

}
