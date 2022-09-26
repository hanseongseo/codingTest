package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main03 {

    public static class Player {
        String id;
        List<Integer> choice; //  1:가위, 2:바위, 3:보

        public Player(String id, List<Integer> choice) {
            this.id = id;
            this.choice = choice;
        }

        public List<String> rockPaperScissors(Player B) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < this.choice.size(); i++) {
                int AChoice = this.choice.get(i);
                int BChoice = B.choice.get(i);
                if (Objects.equals(AChoice, BChoice)) {
                    result.add("D");
                } else if (
                        (AChoice == 1 && BChoice == 3) ||
                                (AChoice == 2 && BChoice == 1) ||
                                (AChoice == 3 && BChoice == 2)
                ) {
                    result.add(this.id);
                } else {
                    result.add(B.id);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player A = new Player("A", new ArrayList<>());
        Player B = new Player("B", new ArrayList<>());

        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            A.choice.add(Integer.valueOf(stringTokenizer.nextToken()));
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            B.choice.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        List<String> result = A.rockPaperScissors(B);
        for (String s : result) {
            System.out.println(s);
        }
    }

}
