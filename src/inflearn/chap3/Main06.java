package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int length = Integer.parseInt(tokenizer.nextToken());
        int change = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int start = 0;
        int count = 0;
        int chance = change;
        for (int idx = 0; start < arr.length; idx++) {
            if (idx < arr.length) {
                if (arr[idx] == 1) {
                    count++;
                } else {
                    if (chance > 0) {
                        chance--;
                        count++;
                    } else {
                        answer = Math.max(answer, count);
                        // 초기화
                        count = 0;
                        chance = change;
                        start++;
                        idx = start;
                    }
                }
            } else {
                answer = Math.max(answer, count);
                // 초기화
                count = 0;
                chance = change;
                start++;
                idx = start;
            }
        }
        System.out.println(answer);
    }
}
