package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bufferedReader.readLine());
        String[] answerArr = new String[inputCount];

        for (int i = 0; i < inputCount; i++) {
            String[] input = bufferedReader.readLine().split("");
            answerArr[i] = "";
            for (int j = 0; j < input.length; j++) {
                answerArr[i] += input[input.length - 1 - j];
            }
            System.out.println(answerArr[i]);
        }
    }
}
