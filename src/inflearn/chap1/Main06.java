package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// 중복 문자 제거
public class Main06 {
    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputToCharArr = bufferedReader.readLine().toCharArray();

        Set<Character> answerSet = new LinkedHashSet<>();

        for (int i = 0; i < inputToCharArr.length; i++) {
            answerSet.add(inputToCharArr[i]);
        }

        Iterator answerIter = answerSet.iterator();

        for (int i = 0; i < answerSet.size(); i++) {
            answer += answerIter.next();
        }

        System.out.println(answer);
    }
}
