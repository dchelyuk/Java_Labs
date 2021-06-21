package data.processing;

import java.util.Scanner;

public class AppTests {
    public static void main(String[] args) {

        System.out.print("Enter input line: ");
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        System.out.print("Enter expected line: ");
        String expectedStr = input.nextLine();
        input.close();
        runTest(inputStr, expectedStr);
    }

    public static void runTest(String inputStr, String expectedStr) {

        App app = new App();
        String actualStr = app.replaceSingleNumberWithLetters(inputStr);
        boolean isPassed = actualStr.equals(expectedStr);
        System.out.println("Input:    " + inputStr);
        System.out.println("Expected: " + expectedStr);
        System.out.println("Actual:   " + actualStr);
        System.out.println("=== Test " + (isPassed ? "PASSED" : "FAILED") + " ===");
        System.out.println();
    }
}
