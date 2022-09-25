package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        char[] input1Arr = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < input1Arr.length; i++) {
            if (input1Arr[i] > 'A' && input1Arr[i] < 'Z') {
                input1Arr[i] = Character.toLowerCase(input1Arr[i]);
            }
        }

        char[] input2Arr = bufferedReader.readLine().toCharArray();
        char input2 = input1Arr[0];

        for (int i = 0; i < input1Arr.length; i++) {
            if (input1Arr[i] == input2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
