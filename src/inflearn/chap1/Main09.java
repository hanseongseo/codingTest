package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자만 추출
public class Main09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArr = bufferedReader.readLine().toCharArray();
        String numbersToString = "";
        for (char c : inputToCharArr) {
            if (c >= '0' && c <= '9') {
                numbersToString += c;
            }
        }
        int answer = Integer.parseInt(numbersToString);
        System.out.println(answer);
    }
}
