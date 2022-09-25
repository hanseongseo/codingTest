package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 폰켄몬 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringTokenizer = bufferedReader.readLine().split("");
        int[] input = new int[stringTokenizer.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(stringTokenizer[i]);
        }

        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }


}

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> monsterMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            monsterMap.put(nums[i], i);
        }

        int answer = 0;

        for (int i = 1; i <= 200000 ; i++) {
            if (monsterMap.containsKey(i)) {
                answer++;
            }
        }

        if (answer >= (nums.length / 2)) {
            answer = nums.length / 2;
        }

        return answer;
    }
}
