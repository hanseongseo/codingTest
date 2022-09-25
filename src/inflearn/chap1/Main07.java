package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 회문 문자열
public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArr = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < inputToCharArr.length; i++) {
            if (inputToCharArr[i] >= 'A' && inputToCharArr[i] <= 'Z') {
                inputToCharArr[i] = Character.toLowerCase(inputToCharArr[i]);
            }
        }

        char[] inputReverse = new char[inputToCharArr.length];
        for (int i = 0; i < inputReverse.length; i++) {
            inputReverse[i] = inputToCharArr[inputToCharArr.length - 1 - i];
        }


        if (Arrays.equals(inputToCharArr, inputReverse)) { System.out.println("YES"); }
        else { System.out.println("NO"); }
    }
}
