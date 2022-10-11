package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int period = Integer.parseInt(tokenizer.nextToken());
        int term = Integer.parseInt(tokenizer.nextToken());
        String[] revenues = bufferedReader.readLine().split(" ");

        Map<String, Integer> revenueMap = new HashMap<>();
        for (int i = 0; i < term; i++) {
            revenueMap.put(revenues[i], revenueMap.getOrDefault(revenues[i], 0) + 1);
        }

        System.out.print(revenueMap.size() + " ");

        int left = 0;
        for (int right = term; right < period; right++) {
            revenueMap.put(revenues[right], revenueMap.getOrDefault(revenues[right], 0) + 1);
            revenueMap.put(revenues[left], revenueMap.get(revenues[left]) - 1);
            if (revenueMap.get(revenues[left]) == 0) revenueMap.remove(revenues[left]);
            left++;
            System.out.print(revenueMap.size() + " ");
        }

    }
}
