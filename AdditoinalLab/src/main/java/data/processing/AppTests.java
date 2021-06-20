package data.processing;

import java.util.Scanner;

public class AppTests {
    public static void main(String[] args) {

        String inputStr = "asd";
        String expectedStr = "asd";
        runTest(inputStr, expectedStr);

        inputStr = "3;djskf 4jkg;lh5fljkd;r6;cv,bn,87kl;fg 599 ldj5 9 4fdgb;lkj";
        expectedStr = "C;djskf Djkg;lhEfljkd;rF;cv,bn,87kl;fg 599 ldjE I Dfdgb;lkj";
        runTest(inputStr, expectedStr);

        inputStr = "2jkfsgj5jkl5479864hjkljk;567 6 7 8 5 4 3 3 kl4 56fkl;";
        expectedStr = "BjkfsgjEjkl5479864hjkljk;567 F G H E D C C klD 56fkl;";
        runTest(inputStr, expectedStr);

        inputStr = "";
        expectedStr = "";
        runTest(inputStr, expectedStr);

        inputStr = "3";
        expectedStr = "C";
        runTest(inputStr, expectedStr);

        inputStr = "acd5";
        expectedStr = "acdE";
        runTest(inputStr, expectedStr);

        inputStr = "4fsvgh";
        expectedStr = "Dfsvgh";
        runTest(inputStr, expectedStr);

        System.out.print("Enter input line: ");
        Scanner input = new Scanner(System.in);
        inputStr = input.nextLine();
        System.out.print("Enter expected line: ");
        expectedStr = input.nextLine();
        input.close();
        runTest(inputStr, expectedStr);
    }

    public static void runTest(String inputStr, String expectedStr) {

        App app = new App();
        String actualStr = app.repl(inputStr);
        boolean isPassed = actualStr.equals(expectedStr);
        System.out.println("Input:    " + inputStr);
        System.out.println("Expected: " + expectedStr);
        System.out.println("Actual:   " + actualStr);
        System.out.println("=== Test " + (isPassed ? "PASSED" : "FAILED") + " ===");
        System.out.println();
    }
}
