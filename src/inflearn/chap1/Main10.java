package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 가장 짧은 거리
public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = bufferedReader.readLine().split(" ");
        String[] inputToCharArr = inputArr[0].split("");
        List<Integer> indexArr = new ArrayList<>();

        int[] answer = new int[inputToCharArr.length];

        for (int i = 0; i < inputToCharArr.length; i++) {
            if (inputToCharArr[i].equals(inputArr[1])) {
                indexArr.add(i);
            }
        }

        for (int i = 0; i < inputToCharArr.length; i++) {
            int[] gapArr = new int[indexArr.size()];
            for (int j = 0; j < indexArr.size(); j++) {
                gapArr[j] = Math.abs(indexArr.get(j) - i);
            }

            answer[i] = Arrays.stream(gapArr).min().getAsInt();
        }

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}
