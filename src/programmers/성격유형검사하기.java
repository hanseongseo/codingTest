package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class 성격유형검사하기 {
    public  static class Solution {

        String[] typeArr = {"R", "T", "C", "F", "J", "M", "A", "N"};

        public String solution(String[] survey, int[] choices) {
            String answer = "";

            Map<String, Integer> typeAndCountMap = new HashMap<>();

            for (int i = 0; i < typeArr.length; i++) {
                typeAndCountMap.put(typeArr[i], 0);
            }

            for (int i = 0; i < survey.length; i++) {
                String[] surveyArr = survey[i].split("");
                if (choices[i] != 4) {
                    if (choices[i] / 4 == 0) {
                        typeAndCountMap.put(surveyArr[0], typeAndCountMap.get(surveyArr[0]) + (choices[0] % 4));
                    } else if (choices[i] / 4 == 1) {
                        typeAndCountMap.put(surveyArr[1], typeAndCountMap.get(surveyArr[1]) + (choices[1] % 4));
                    }
                }
            }

            if (typeAndCountMap.get("R") > typeAndCountMap.get("T") || Objects.equals(typeAndCountMap.get("R"), typeAndCountMap.get("T"))) {
                answer += "R";
            } else if (typeAndCountMap.get("R") < typeAndCountMap.get("T")) {
                answer += "T";
            }

            if (typeAndCountMap.get("C") > typeAndCountMap.get("F") || Objects.equals(typeAndCountMap.get("C"), typeAndCountMap.get("F"))) {
                answer += "C";
            } else if (typeAndCountMap.get("C") < typeAndCountMap.get("F")) {
                answer += "F";
            }

            if (typeAndCountMap.get("J") > typeAndCountMap.get("M") || Objects.equals(typeAndCountMap.get("J"), typeAndCountMap.get("M"))) {
                answer += "J";
            } else if (typeAndCountMap.get("J") < typeAndCountMap.get("M")) {
                answer += "M";
            }

            if (typeAndCountMap.get("A") > typeAndCountMap.get("N") || Objects.equals(typeAndCountMap.get("A"), typeAndCountMap.get("N"))) {
                answer += "A";
            } else if (typeAndCountMap.get("A") < typeAndCountMap.get("N")) {
                answer += "N";
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"AN", "CF", "MJ", "RT", "NA"};
        int[] b = {5, 3, 2, 7, 5};

        System.out.println("solution = " + solution.solution(a, b));

    }
}
