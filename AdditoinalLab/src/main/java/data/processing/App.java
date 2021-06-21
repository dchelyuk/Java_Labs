package data.processing;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static Map<Character, Character> charMap = new HashMap<>(Map.of('1', 'A', '2', 'B', '3', 'C',
            '4', 'D', '5', 'E', '6', 'F', '7', 'G', '8', 'H', '9', 'I',
            '0', 'J'));

    static String firstElementRegexTemplate = "^\\d\\s";
    static String singleElementRegexTemplate = "^\\d$";
    static String lastElementRegexTemplate = "\\s\\d$";
    static String generalRegexTemplate = "\\s\\d ";
    static Pattern firstElementPattern = Pattern.compile(firstElementRegexTemplate);
    static Pattern singleElementPattern = Pattern.compile(singleElementRegexTemplate);
    static Pattern lastElementPattern = Pattern.compile(lastElementRegexTemplate);
    static Pattern generalPattern = Pattern.compile(generalRegexTemplate);

    public static void main(String[] args) {
        System.out.println("Enter your line:");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.println("You entered: " + line);
        input.close();
        App app = new App();
        System.out.println("Result:      " + app.replaceSingleNumberWithLetters(line));
    }

    public String replaceSingleNumberWithLetters(String line) {
        Matcher firsElementMatcher = firstElementPattern.matcher(line);
        Matcher singleElementMatcher = singleElementPattern.matcher(line);
        Matcher lastElementMatcher = lastElementPattern.matcher(line);
        Matcher generalMatcher = generalPattern.matcher(line);
        char[] result = line.toCharArray();

        if (singleElementMatcher.find()) {
            result[0] = charMap.get(result[0]);
        }
        if (firsElementMatcher.find()) {
            result[0] = charMap.get(result[0]);
        }
        if (lastElementMatcher.find()) {
            result[lastElementMatcher.start() + 1] = charMap.get(result[lastElementMatcher.start() + 1]);
        }
        int i = 0;
        while (generalMatcher.find(i)) {
            result[generalMatcher.start() + 1] = charMap.get(result[generalMatcher.start() + 1]);
            i = generalMatcher.end() - 1;
        }
        return String.valueOf(result);
    }
}
