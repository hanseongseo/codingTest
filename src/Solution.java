import java.util.Arrays;

public class Solution {
    public int solution(String s) {

        if (s.length() == 1) return 1;
        if (isPalindrome(s)) return s.length();

        String answer = "";

        for (int leftIndex = 0; leftIndex < s.length(); leftIndex++) {
            for (int rightIndex = s.length(); rightIndex >= leftIndex; rightIndex--) {
                String substringOfS = s.substring(leftIndex, rightIndex);
                if (isPalindrome(substringOfS) && (substringOfS.length() > answer.length())) {
                    answer = substringOfS;
                }
            }
        }

        return answer.length();
    }

    public boolean isPalindrome(String input) {
        StringBuilder inputReverse = new StringBuilder(input).reverse();
        return input.equals(inputReverse.toString());
    }
//  네트워크 문제
    int [][] networkSolution(int n, int [][] signs) {
        int[][] result = new int[n][n];
//      row
        for (int row = 0; row < n; row++) {
//          column
            for (int col = 0; col < n; col++) {
                dfs(row, row, col, signs, result, n);
            }
        }
        return result;
    }

    private void dfs(int root, int start, int destination, int[][] signs, int[][] result, int n) {
        if (signs[start][destination] == 0 || result[root][destination] == 1) {
            return;
        }

        result[root][destination] = 1;
        int nextStart = destination;
        for (destination = 0; destination < n; destination++) {
            if (nextStart == root) {
                return;
            }
            dfs(root, nextStart, destination, signs, result, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] signs = {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.networkSolution(n, signs)));


    }


}
