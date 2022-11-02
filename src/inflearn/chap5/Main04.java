package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] inputArr = bufferedReader.readLine().toCharArray();
        Stack<Integer> inputStack = new Stack<>();
        for (char c : inputArr) {
            if (c >= '1' && c <= '9') {
                inputStack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                if (c == '+') {
                    Integer rt = inputStack.pop();
                    Integer lt = inputStack.pop();
                    inputStack.push(lt + rt);
                } else if (c == '-') {
                    Integer rt = inputStack.pop();
                    Integer lt = inputStack.pop();
                    inputStack.push(lt - rt);
                } else if (c == '*') {
                    Integer rt = inputStack.pop();
                    Integer lt = inputStack.pop();
                    inputStack.push(lt * rt);
                } else if (c == '/') {
                    Integer rt = inputStack.pop();
                    Integer lt = inputStack.pop();
                    inputStack.push(lt / rt);
                }
            }
        }

        System.out.println(inputStack.pop());
    }
}
