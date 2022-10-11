package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char answer = 0;

        int count = Integer.parseInt(bufferedReader.readLine());
        char[] votes = bufferedReader.readLine().toCharArray();
        Map<Character, Integer> voteMap = new HashMap<>();
        for (char c : votes) {
            voteMap.put(c, voteMap.getOrDefault(c, 0) + 1);
        }

        int tmp = 0;
        for (char c = 'A'; c <= 'E'; c++) {
            if (tmp < voteMap.get(c)) {
                tmp = voteMap.get(c);
                answer = c;
            }
        }

        System.out.println(answer);
    }
}
