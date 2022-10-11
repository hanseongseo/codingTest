package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int count = Integer.parseInt(tokenizer.nextToken());
        int th = Integer.parseInt(tokenizer.nextToken());
        Set<Integer> sumSet = new LinkedHashSet<>();

        int[] arr = new int[count];
        tokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < count; i++) arr[i] = Integer.parseInt(tokenizer.nextToken());

        int left = 0;
        int middle = 1;
        int right = 2;
        while (
                !((left == count - 3) &&
                        (middle == count - 2) &&
                        (right == count - 1))
        ){
            sumSet.add(arr[left] + arr[middle] + arr[right++]);
            if (right == count) {
                if (middle == count - 2) {
                    left++;
                    middle = left + 1;
                    right = middle + 1;
                } else {
                    middle++;
                    right = middle + 1;
                }
            }
        }
        ArrayList<Integer> sumArray = new ArrayList<>(sumSet);
        Collections.sort(sumArray);
        Collections.reverse(sumArray);

        if (sumArray.size() < th) {
            System.out.println(-1);
        } else {
            System.out.println(sumArray.get(th - 1));
        }
    }
}
