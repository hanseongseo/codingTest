package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String big = bufferedReader.readLine();
        String small = bufferedReader.readLine();

        int left = 0;
        for (int right = small.length(); right <= big.length(); right++) {
            if (isAnagram(small, big.substring(left, right))) answer++;
            left++;
        }

        System.out.println(answer);
    }

    public static boolean isAnagram(String a, String b) {
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char c : a.toCharArray()) {
            aMap.put(c, aMap.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        return aMap.equals(bMap);
    }
}
