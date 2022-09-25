package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 유효한 팰린드롬
public class Main08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArr = bufferedReader.readLine().toCharArray();
        String alphabets = "";
        String alphabetsReverse = "";

        for (int i = 0; i < inputToCharArr.length; i++) {
            if (inputToCharArr[i] >= 'A' && inputToCharArr[i] <= 'Z') {
                inputToCharArr[i] += 32;
            }
            if (inputToCharArr[i] >= 'a' && inputToCharArr[i] <= 'z') {
                alphabets += inputToCharArr[i];
            }
        }

        char[] alphabetsToCharArr = alphabets.toCharArray();
        char[] alphabetsReverseToCharArr = new char[alphabets.length()];
        for (int i = 0; i < alphabetsReverseToCharArr.length; i++) {
            alphabetsReverseToCharArr[i] = alphabetsToCharArr[alphabetsToCharArr.length - 1 - i];
            alphabetsReverse += alphabetsReverseToCharArr[i];
        }

        if (alphabets.equals(alphabetsReverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
