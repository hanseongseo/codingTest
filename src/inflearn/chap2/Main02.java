package inflearn.chap2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] inputArr = new int[count];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int tallest = inputArr[0];
        int visibleCount = 1;
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] > tallest) {
                visibleCount++;
                tallest = inputArr[i];
            }
        }
        System.out.println(visibleCount);
    }
}
