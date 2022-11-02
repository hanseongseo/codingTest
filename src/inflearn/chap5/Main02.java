package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 2. 괄호문자제거
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 남은 문자만 출력한다.
 *
 * 예시 입력 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * 예시 출력 1
 * EFLM
 */
public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        System.out.println(removeBracketWords(input));
    }

    public static String removeBracketWords(String input) {
        StringBuilder result = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();
        for (char x : input.toCharArray()) {
            char tmp = 0;
            if (x == ')') {
                while (tmp != '(') {
                    tmp = characterStack.pop();
                }
            } else {
                characterStack.push(x);
            }
        }

        for (char x : characterStack) {
            result.append(x);
        }
        return result.toString();
    }
}

