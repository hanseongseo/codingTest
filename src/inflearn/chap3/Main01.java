package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> combinedList = new ArrayList<>();

        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(tokenizer.nextToken());
            combinedList.add(numArr[i]);
        }

        count = Integer.parseInt(bufferedReader.readLine());
        tokenizer = new StringTokenizer(bufferedReader.readLine());
        numArr = new int[count];
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(tokenizer.nextToken());
            combinedList.add(numArr[i]);
        }

        Collections.sort(combinedList);
        Iterator<Integer> iterator = combinedList.iterator();
        for (int i = 0; i < combinedList.size(); i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
