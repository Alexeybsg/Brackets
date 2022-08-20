import org.example.SimpleProgram;
import org.example.Stepik3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestStepik3 {


    @Test
    public void testStepik3() throws Exception {
        InputStream inputStream = new FileInputStream("/Users/mac/IdeaProjects/Brackets/src/test/java/tests.txt");
        System.setIn(inputStream);

        Stepik3.main(new String[0]);
        //SimpleProgram.main(new String[0]);
        //OutputStream outputStream = new ByteArrayOutputStream();


        //Assert.assertEquals("0", "outputStream.toString(");

    }
}
