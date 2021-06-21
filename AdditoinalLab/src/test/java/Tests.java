import data.processing.App;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Tests {
    private String inputStr, expectedStr;
    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    public Tests(String inputStr, String expectedStr) {
        this.inputStr = inputStr;
        this.expectedStr = expectedStr;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new Object[][]{
                {"asd", "asd"},
                {"3;djskf 4jkg;lh5d;r6;cvn,87kl;fg 59 9 lj5 9 4fb", "3;djskf 4jkg;lh5d;r6;cvn,87kl;fg 59 I lj5 I 4fb"},
                {"2 jkj 5 jkl5479864hjjk;567 6 7 8 5 4 3 3 kl4 6", "B jkj E jkl5479864hjjk;567 F G H E D C C kl4 F"},
                {"", ""},
                {"3", "C"},
                {"acd 5", "acd E"}
        });
    }

    @Test
    public void testReplacement() {
        System.out.println("Input:    " + inputStr);
        System.out.println("Expected: " + this.expectedStr);
        assertEquals(expectedStr, app.replaceSingleNumberWithLetters(inputStr));
    }
}
