package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();

        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] numArr1 = new int[count];
        for (int i = 0; i < count; i++) {
            numArr1[i] = Integer.parseInt(tokenizer.nextToken());
        }

        count = Integer.parseInt(bufferedReader.readLine());
        tokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] numArr2 = new int[count];
        for (int i = 0; i < count; i++) {
            numArr2[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(numArr1);
        Arrays.sort(numArr2);

        int p1 = 0;
        int p2 = 0;
        while (p1 < count && p2 < count) {
            if (numArr1[p1] == numArr2[p2]) {
                result.add(numArr1[p1]);
                p1++;
                p2++;
            } else if (numArr1[p1] < numArr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}
