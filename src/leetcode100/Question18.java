package leetcode100;

public class Question18 {
    public static void main(String[] args) {
        boolean[] visited = new boolean[3]; // 默认值为false
        System.out.println(visited[0]);
        System.out.println(visited[1]);
    }

    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) continue;
                row[i] = true;
                col[j] = true;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] || col[j]) matrix[i][j] = 0;
            }
        }


    }
}
