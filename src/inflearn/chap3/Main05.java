package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = i + 1;
        }
        int left = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nArr[right];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= nArr[left++];
                if (sum == n) answer++;
            }
        }
        System.out.println(answer - 1);
    }
}
