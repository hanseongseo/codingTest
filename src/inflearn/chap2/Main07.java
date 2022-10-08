package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 8. 등수구하기
 * 설명
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 * 출력
 * 입력된 순서대로 등수를 출력한다.
 *
 * 예시 입력 1
 * 5
 * 87 89 92 100 76
 * 예시 출력 1
 * 4 3 2 1 5
 */
public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] numArr = new int[count];
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < count; i++) {
            System.out.print(rank(numArr, numArr[i]) + " ");
        }
    }

    public static int rank(int[] numArr, int n) {
        int rank = 1;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > n) {
                rank++;
            }
        }
        return rank;
    }
}
