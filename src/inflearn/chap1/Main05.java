package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main05 {
    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArr = bufferedReader.readLine().toCharArray();
        boolean[] isAlphabet = new boolean[inputToCharArr.length];

        List<Character> alphabetOfInput = new ArrayList<>();
        List<Character> elseOfInput = new ArrayList<>();

        for (int i = 0; i < inputToCharArr.length; i++) {
            isAlphabet[i] = (inputToCharArr[i] >= 'a' && inputToCharArr[i] <= 'z')
                    || (inputToCharArr[i] >= 'A' && inputToCharArr[i] <= 'Z');
            if (isAlphabet[i]) {
                alphabetOfInput.add(inputToCharArr[i]);
            } else {
                elseOfInput.add(inputToCharArr[i]);
            }
        }

        Collections.reverse(alphabetOfInput);

        Iterator alphabetIter = alphabetOfInput.iterator();
        Iterator elseIter = elseOfInput.iterator();

        for (int i = 0; i < inputToCharArr.length; i++) {
            if (isAlphabet[i]) {
                answer += alphabetIter.next();
            } else {
                answer += elseIter.next();
            }
        }

        System.out.println(answer);
    }
}
