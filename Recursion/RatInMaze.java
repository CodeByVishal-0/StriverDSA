package Recursion;

import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 }
        };
        List<String> list = new ArrayList<>();
        helper(mat, 0, 0, list, "");
        System.out.println(list);

    }

    public static void helper(int[][] mat, int i, int j, List<String> list, String s) {
        int m = mat.length;
        int n = mat[0].length;
        if (j >= n || i >= m || i < 0 || j < 0 || mat[i][j] == 0) {
            return;
        }
        if (i == m - 1 && j == n - 1) {
            list.add(s);
            return;
        }
        mat[i][j] = 0;
        helper(mat, i + 1, j, list, s + 'D');
        helper(mat, i - 1, j, list, s + 'U');
        helper(mat, i, j + 1, list, s + 'R');
        helper(mat, i, j - 1, list, s + 'L');
        mat[i][j] = 1;

    }

}
