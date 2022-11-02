package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {
        int result = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer>[] stacks = new Stack[count];

        for (int i = 0; i < count; i++) {
            stacks[i] = new Stack<>();
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < count; j++) {
                int tmp = Integer.parseInt(tokenizer.nextToken());
                if (tmp != 0) {
                    stacks[j].push(tmp);
                }
            }
        }

        Stack<Integer>[] reverseStacks = new Stack[stacks.length];
        for (int i = 0; i < count; i++) {
            reverseStacks[i] = new Stack<>();
        }

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                reverseStacks[i].push(stacks[i].pop());
            }
        }

        int moveCount = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] moves = new int[moveCount];
        for (int i = 0; i < moveCount; i++) {
            moves[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Stack<Integer> basket = new Stack<>();
        basket.push(0);

        for (int i = 0; i < moveCount; i++) {
            int boardNum = moves[i] - 1;
            if (!reverseStacks[boardNum].isEmpty()) {
                if (Objects.equals(basket.peek(), reverseStacks[boardNum].peek())) {
                    basket.pop();
                    reverseStacks[boardNum].pop();
                    result += 2;
                } else {
                    basket.push(reverseStacks[boardNum].pop());
                }
            }
        }

        System.out.println(result);
    }
}
