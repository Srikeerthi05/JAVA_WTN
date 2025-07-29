import java.util.*;

public class StringArrayListOps {

    public static List<String> performOperations(String s1, String s2) {
        List<String> result = new ArrayList<>();

        // 1. Replace each alternate character of S1 with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        result.add(op1.toString());

        // 2. If S2 appears more than once, replace last occurrence with reverse of S2
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String reversedS2 = new StringBuilder(s2).reverse().toString();
            String temp = s1.substring(0, lastIndex) + reversedS2 + s1.substring(lastIndex + s2.length());
            result.add(temp);
        } else {
            result.add(s1 + s2);
        }

        // 3. If S2 appears more than once, delete first occurrence of S2
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String temp = s1.substring(0, firstIndex) + s1.substring(firstIndex + s2.length());
            result.add(temp);
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves and add to start and end of S1
        int mid = (s2.length() + 1) / 2; // (n/2)+1 if odd
        String part1 = s2.substring(0, mid);
        String part2 = s2.substring(mid);
        result.add(part1 + s1 + part2);

        // 5. Replace characters in S1 that are present in S2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1) {
                op5.append('*');
            } else {
                op5.append(c);
            }
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        List<String> output = performOperations(s1, s2);

        System.out.println("Output: " + output);
    }
}
