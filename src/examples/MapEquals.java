package examples;

import java.util.HashMap;
import java.util.Map;

public class MapEquals {
    public static void main(String[] args) {
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        a.put('A', 3);
        a.put('B', 2);

        b.put('A', 3);
        b.put('B', 2);

        System.out.println(a.equals(b));
    }
}
