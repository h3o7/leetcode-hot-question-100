package leetcode100;

public class Question21 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int row = 0, col = 0;
        boolean flag = false;
        // 确定行
        for (int i = 0; i < rowSize; i++) {
            if (matrix[i][0] < target) continue;
            else if (matrix[i][0] == target) return true;
            else {
                flag = true;
                row = i - 1;
                break;
            }
        }
        if (!flag) row = rowSize - 1;

        // 确定列
        flag = false;
        for (int i = 0; i < colSize; i++) {
            if (matrix[0][i] < target) continue;
            else if (matrix[0][i] == target) return true;
            else {
                flag = true;
                col = i - 1;
                break;
            }
        }
        if (!flag) col = colSize - 1;
        if (row < 0 || col < 0) return false;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (matrix[i][j] < target) continue;
                else if (matrix[i][j] == target) return true;
                else {
                    col--;
                    break;
                }
            }
        }

        return false;
    }


}
