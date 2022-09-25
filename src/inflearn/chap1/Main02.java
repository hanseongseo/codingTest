package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String answer = "";

        char[] inputArr = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] >= 'a' && inputArr[i] <= 'z') {
                inputArr[i] -= 32;
            } else if (inputArr[i] >= 'A' && inputArr[i] <= 'Z') {
                inputArr[i] += 32;
            }
            answer += inputArr[i];
        }

        System.out.println(answer);
    }
}
