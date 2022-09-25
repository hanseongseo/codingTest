import java.util.Arrays;

public class Example {
    public int[][] solution(int n, int[][] signs) {
        int[][] result = new int[n][n];

        for (int target = 0; target < n; target++) {
            for (int point = 0; point < n; point++) {
                dfs(target, target, point, signs, result, n);
            }
        }
        return result;
    }

    private void dfs(int target, int point, int pointEnd, int[][] signs, int[][] result, int n) {
        if (signs[point][pointEnd] == 0 || result[target][pointEnd] == 1) {
            return;
        }

        result[target][pointEnd] = 1;
        int nextPoint = pointEnd;
        for (pointEnd = 0; pointEnd < n; pointEnd++) {
            if (nextPoint == target) {
                return;
            }
            dfs(target, nextPoint, pointEnd, signs, result, n);
        }
    }
}
