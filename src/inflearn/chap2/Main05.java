package inflearn.chap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bufferedReader.readLine());

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < count; i++) {
            List<Integer> divisors = new ArrayList<>();
            Inner : for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                } else if (divisors.size() > 1) {
                    break Inner;
                }
            }
            if (divisors.size() < 2) {
                primeNumbers.add(i);
            }
        }

        primeNumbers.remove(0);
        bufferedWriter.write(String.valueOf(primeNumbers.size()));
        bufferedWriter.flush();

    }
}
