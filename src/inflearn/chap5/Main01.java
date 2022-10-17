package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        if (isValidBracket(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isValidBracket(String brackets) {
        Stack<Character> bracketStack = new Stack<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(') bracketStack.push(bracket);
            else if (bracket == ')') {
                if (bracketStack.isEmpty()) return false;
                else bracketStack.pop();
            }
        }
        if (!bracketStack.isEmpty()) return false;
        return true;
    }

}
