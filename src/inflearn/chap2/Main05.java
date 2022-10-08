package inflearn.chap2;

import java.io.*;

public class Main05 {

    // 에라토스테네스 체
    public static int primeNumCount(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i < ch.length; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j < ch.length; j = j + i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Main05.primeNumCount(n));
    }
}
