package data.processing;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public String repl(String line) {
        // public static void main(String[] args) {
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('1', 'A');
        dictionary.put('2', 'B');
        dictionary.put('3', 'C');
        dictionary.put('4', 'D');
        dictionary.put('5', 'E');
        dictionary.put('6', 'F');
        dictionary.put('7', 'G');
        dictionary.put('8', 'H');
        dictionary.put('9', 'I');
        dictionary.put('0', 'J');
        // TODO: remove default line
//        String line = "3;djskf 4jkg;lh5fljkd;r6;cv,bn,87kl;fg 599 ldj5 9 4fdgb;lkj";

        String reFirst = "^\\d\\D";
        String re = "\\D\\d\\D";

        System.out.println("Enter your line:");
        System.out.println(line);

        // Scanner input = new Scanner(System.in); TODO: uncomment input start
        // String line = input.nextLine(); TODO: uncomment input scan
        System.out.println("You entered: " + line);
        // input.close(); TODO: uncomment input end

        Pattern firstPattern = Pattern.compile(reFirst);
        Matcher firstMatcher = firstPattern.matcher(line);

        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(line);

        char[] result = line.toCharArray();
        if (firstMatcher.find()) {
            result[0] = dictionary.get(result[0]);
        }

        int i = 0;
        while (matcher.find(i)) {
            result[matcher.start() + 1] = dictionary.get(result[matcher.start() + 1]);
            i = matcher.end() - 1;
        }
        System.out.print("Result:      ");
        System.out.println(result);
        return String.valueOf(result);
    }
}
