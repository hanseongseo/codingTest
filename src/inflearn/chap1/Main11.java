package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArray = bufferedReader.readLine().toCharArray();
        String includingSpace = String.valueOf(inputToCharArray[0]);
        for (int i = 1; i < inputToCharArray.length; i++) {
            if (inputToCharArray[i] != inputToCharArray[i - 1]) {
                includingSpace += " " + inputToCharArray[i];
            } else {
                includingSpace += inputToCharArray[i];
            }
        }

        String[] includingSpaceSplits = includingSpace.split(" ");

        System.out.print(Arrays.toString(includingSpaceSplits));

        for (int i = 0; i < includingSpaceSplits.length; i++) {
            if (includingSpaceSplits[i].length() == 1) {
                answer += includingSpaceSplits[i].split("")[0];
            } else {
                answer += includingSpaceSplits[i].split("")[0] + includingSpaceSplits[i].length();
            }
        }

        System.out.print(answer);

    }
}
