package leetcode100.graphtheory;

public class Question1 {


    int[][] directionArr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    grid[i][j] = '0';
                    helper(grid, i, j);
                }
            }
        }

        return count;
    }

    // 对陆地的探索
    public void helper(char[][] grid, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int newX = x + directionArr[i][0];
            int newY = y + directionArr[i][1];
            if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) continue;
            if (grid[newX][newY] == '0') continue;
            grid[newX][newY] = '0';
            helper(grid, newX, newY);
        }
    }


}
