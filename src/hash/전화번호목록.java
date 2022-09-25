package hash;

import java.util.Arrays;

public class 전화번호목록 {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 1; j + i < phone_book.length; j++) {
                    if (phone_book[i + j].contains(phone_book[i])) {
                        answer = false;
                    }
                }
            }


            return answer;
        }

    public static void main(String[] args) {
        전화번호목록 cla = new 전화번호목록();
        System.out.println(cla.solution(new String[] {"119", "97674223", "1195524421"}));
    }
}
