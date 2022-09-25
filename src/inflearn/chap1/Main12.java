package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String input = bufferedReader.readLine();
        String inputToBinaryCode = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.split("")[i].equals("#")) {
                inputToBinaryCode += "1";
            } else {
                inputToBinaryCode += "0";
            }
        }

        String[] binaryCodeArr = new String[count];
        Arrays.fill(binaryCodeArr, "");

        for (int i = 0; i < count; i++) {
            for (int j = (i * 7); j / 7 == i; j++) {
                binaryCodeArr[i] += inputToBinaryCode.split("")[j];
            }
        }

        char[] answerArr = new char[count];
        for (int i = 0; i < count; i++) {
            answerArr[i] = (char) Integer.parseInt(binaryCodeArr[i], 2);
        }

        System.out.println(answerArr);
    }
}
