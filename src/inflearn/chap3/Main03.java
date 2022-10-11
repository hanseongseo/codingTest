package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sumList = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int period = Integer.parseInt(tokenizer.nextToken());
        int term = Integer.parseInt(tokenizer.nextToken());

        int[] revenues = new int[period];
        tokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < period; i++) {
            revenues[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < term; i++) sum += revenues[i];
        for (int i = term; i < period; i++) {
            sum -= revenues[i - term];
            sum += revenues[i];
            answer = Math.max(sum, answer);
        }
        System.out.println(answer);
    }
}
