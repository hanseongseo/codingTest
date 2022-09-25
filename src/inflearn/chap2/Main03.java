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

        public String rockPaperScissors(Player B) {
            for (int i = 0; i < this.choice.size(); i++) {
                int AChoice = this.choice.iterator().next();
                int BChoice = B.choice.iterator().next();
                if (Objects.equals(AChoice, BChoice)) {
                    return "D";
                } else if (
                        (AChoice == 1 && BChoice == 3) ||
                                (AChoice == 2 && BChoice == 1) ||
                                (AChoice == 3 && BChoice == 2)
                ) {
                    return this.id;
                }
            }
            return B.id;
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

        System.out.println(A.choice);
        System.out.println(B.choice);
        for (int i = 0; i < count; i++) {
            System.out.println(A.rockPaperScissors(B));
        }


    }

}
