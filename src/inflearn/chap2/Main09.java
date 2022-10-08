package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

/**
 * 9. 격자판 최대합
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 최대합을 출력합니다.
 */

public class Main09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer[] tokenizers = new StringTokenizer[count];
        for (int i = 0; i < count; i++) {
            tokenizers[i] = new StringTokenizer(bufferedReader.readLine());
        }

        int[][] numArr = new int[count][count];
        StringTokenizer tokenizer;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                numArr[i][j] = Integer.parseInt(tokenizers[i].nextToken());
            }
        }
        List<Integer> sumList = new ArrayList<>();

        // 가로줄 합
        for (int i = 0; i < count; i++) {
            sumList.add(sumArrayValues(numArr[i]));
        }
        // 세로줄 합
        for (int i = 0; i < count; i++) {
            int sum = 0;
            for (int j = 0; j < count; j++) {
                sum += numArr[j][i];
            }
            sumList.add(sum);
        }
        // 대각선 합
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numArr[i][i];
        }
        sumList.add(sum);

        sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numArr[count - 1 - i][i];
        }
        sumList.add(sum);

        System.out.println(maxValueOfList(sumList).getAsInt());

    }

    private static int sumArrayValues(int[] arr) {
        return IntStream.of(arr).sum();
    }

    private static OptionalInt maxValueOfList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).max();
    }


}
