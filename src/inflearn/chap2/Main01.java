package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] inputArr = new int[count];
        for (int i = 0; i < count; i++) {
            inputArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.print(inputArr[0] + " ");
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] > inputArr[i - 1]) {
                System.out.print(inputArr[i] + " ");
            }
        }

    }
}
