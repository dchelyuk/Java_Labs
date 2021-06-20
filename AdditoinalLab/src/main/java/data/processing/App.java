package data.processing;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter your line:");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.println("You entered: " + line);
        input.close();

        App app = new App();
        System.out.println("Result:      " +         app.repl(line));
    }
    public String repl(String line) {
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

        String reFirst = "^\\d\\D";
        String reSingle = "^\\d$";
        String reLast = "\\D\\d$";
        String re = "\\D\\d\\D";

        Pattern firstPattern = Pattern.compile(reFirst);
        Matcher firstMatcher = firstPattern.matcher(line);

        Pattern singlePattern = Pattern.compile(reSingle);
        Matcher singleMatcher = singlePattern.matcher(line);

        Pattern lastPattern = Pattern.compile(reLast);
        Matcher lastMatcher = lastPattern.matcher(line);

        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(line);

        char[] result = line.toCharArray();
        if (firstMatcher.find()) {
            result[0] = dictionary.get(result[0]);
        }

        if (singleMatcher.find()) {
            result[0] = dictionary.get(result[0]);
        }

        if (lastMatcher.find()) {
            result[lastMatcher.start() + 1] = dictionary.get(result[lastMatcher.start() + 1]);
        }

        int i = 0;
        while (matcher.find(i)) {
            result[matcher.start() + 1] = dictionary.get(result[matcher.start() + 1]);
            i = matcher.end() - 1;
        }

        return String.valueOf(result);
    }
}
