package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputWords = bufferedReader.readLine().split(" ");
        int[] wordsLengthArr = new int[inputWords.length];
        for (int i = 0; i < wordsLengthArr.length; i++) {
            wordsLengthArr[i] = inputWords[i].length();
        }

        OptionalInt optionalAnswer = Arrays.stream(wordsLengthArr).max();
        int answer = optionalAnswer.getAsInt();
        int answerCount = 0;
        int answerIndex = 0;
        for (int i = 0; i < wordsLengthArr.length; i++) {
            if (wordsLengthArr[i] == answer) {
                answerCount++;
                answerIndex = i;
            }
        }
        if (answerCount == 1) {
            System.out.println(inputWords[answerIndex]);
        } else {
            System.out.println(inputWords[0]);
        }


    }
}
