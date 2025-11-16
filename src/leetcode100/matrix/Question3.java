package leetcode100.matrix;

public class Question3 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                newArr[j][n - 1 - i] = matrix[i][j];
        }

        for (int i = 0; i < n; i++)
            System.arraycopy(newArr[i], 0, matrix[i], 0, n);
    }

}
