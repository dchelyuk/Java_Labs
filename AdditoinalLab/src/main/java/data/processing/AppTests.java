package data.processing;

public class AppTests {
    public static void main(String[] args) {

        String inputStr = "asd";
        String resultStr = "asd";
        runTest(inputStr, resultStr);

         inputStr = "3;djskf 4jkg;lh5fljkd;r6;cv,bn,87kl;fg 599 ldj5 9 4fdgb;lkj";
         resultStr = "C;djskf Djkg;lhEfljkd;rF;cv,bn,87kl;fg 599 ldjE I Dfdgb;lkj";
        runTest(inputStr, resultStr);
    }

    public static void runTest(String inputStr, String resultStr) {
        System.out.println();
        App app = new App();
        String res = app.repl(inputStr);
        Boolean isPassed = res.equals(resultStr);
        System.out.println("Test " + (isPassed ? "PASSED" : "FAILED"));
    }
}
