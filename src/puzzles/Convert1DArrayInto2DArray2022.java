package puzzles;

import java.util.Arrays;

public class Convert1DArrayInto2DArray2022 {
  /***
   * You are given a 0-indexed 1-dimensional (1D) integer array original, and two
   * integers, m and n. You are tasked with creating a 2-dimensional (2D) array
   * with m rows and n columns using all the elements from original.
   * 
   * The elements from indices 0 to n - 1 (inclusive) of original should form the
   * first row of the constructed 2D array, the elements from indices n to 2 * n -
   * 1 (inclusive) should form the second row of the constructed 2D array, and so
   * on.
   * 
   * Return an m x n 2D array constructed according to the above procedure, or an
   * empty 2D array if it is impossible.
   */

  public static void main(String[] args) {
    int[] original = { 1,1,1,1 };
    int m = 4;
    int n = 1;

    int[][] result = construct2DArray(original, m, n);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static int[][] construct2DArray(int[] original, int m, int n) {
    if (m * n != original.length) {
      return new int[0][];
    }

    int[][] result = new int[m][n];
    
    for (int i = 0; i < m; i++) {
      result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
    }

    return result;
  }
}
