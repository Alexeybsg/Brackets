//import org.junit.After;
//import static com.github.stefanbirkner.systemlambda.SystemLambda.*;
import static org.junit.Assert.*;

import org.example.OldAnswer;
import org.junit.Test;

public class Testus {

    @Test
    public void testCase1() {

        assertEquals("Success", OldAnswer.checkString("([](){([])})"));
        assertEquals("5", OldAnswer.checkString("()[]}"));
        assertEquals("1", OldAnswer.checkString("{{{**[][][]"));
        assertEquals("1", OldAnswer.checkString("{{[()]}"));
        assertEquals("4", OldAnswer.checkString("{}[}([]"));
        assertEquals("1", OldAnswer.checkString(")))"));
        assertEquals("Success", OldAnswer.checkString("foo(bar({ <some initialization> })[i]);"));
        assertEquals("Success", OldAnswer.checkString(" "));
        assertEquals("3", OldAnswer.checkString("{[}"));

    }

//    @Test
//    public void userInputTest() {
//        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n4\n".getBytes());
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(byteArrayOutputStream);
//        UserInputExample userInputExample = new UserInputExample(inputStream, ps);
//        userInputExample.start();
//        String outputText = byteArrayOutputStream.toString();
//        String key = "output:";
//        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
//        Assert.assertEquals(output, "7");
//    }
}
