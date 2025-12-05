package leetcode100.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Question2 {
    public static void main(String[] args) {
        int[][] grid = {
                {2,2,2,1,1}
        };
        System.out.println(orangesRotting(grid));
    }


    static int[][] directionArr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int orangesRotting(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 2) {
                    int num = i * row + j;
                    queue.add(num);
                    map.put(num, 0);
                }
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int num = queue.remove();
            int r = num / column;
            int c = num % column;
            for (int i = 0; i < 4; i++) {
                int x = r + directionArr[i][0];
                int y = c + directionArr[i][1];
                if (x < 0 || y < 0 || x >= row || y >= column) continue;
                if (grid[x][y] == 1) {
                    grid[x][y] = 2;
                    int code = x * row + y;
                    queue.add(code);
                    map.put(code, map.get(num) + 1);
                    count = map.get(code);
                }
            }
        }

        for (int[] arr : grid) {
            for (int num : arr) {
                if (num == 1) return -1;
            }
        }

        return count;
        // [[2,2,2,1,1]]
    }


}
