package leetcode100;

import java.util.ArrayList;
import java.util.List;

public class Question19 {
    public static void main(String[] args) {
        // 创建大小都为3的二维数组
        int[][] matrix = new int[3][3];
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // 设置辅助数组
        int rowSize = matrix.length, colSize = matrix[0].length;
        boolean[][] subArr = new boolean[rowSize][colSize];


        // 设置顺时针的方向数组
        int[][] directionArr = {
                {0, 1}, {1, 0}, {0, -1}, {-1, 0}
        };
        int x = 0, y = 0;
        int circle = 0;
        // 遍历数组
        while (result.size() < rowSize * colSize) {
            result.add(matrix[x][y]);
            subArr[x][y] = true;
            x += directionArr[circle][0];
            y += directionArr[circle][1];
            if (x >= rowSize || x < 0 || y >= colSize || y < 0 || subArr[x][y]) {
                x -= directionArr[circle][0];
                y -= directionArr[circle][1];
                circle = (circle + 1) % 4;
                x += directionArr[circle][0];
                y += directionArr[circle][1];
            }
            ;
        }
        ;

        return result;
    }


}
