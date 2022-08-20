package org.example;
import java.lang.*;
import java.io.*;

public class ElExample {
        // main method
        public static void main(String[] args) throws Exception {
            // existing file
            System.out.println("---Demo Code for System.setIn() Method---");
            InputStream stream = new FileInputStream("/Users/mac/IdeaProjects/Brackets/src/main/java/org/example/data.txt");
            System.setIn(stream);
            // read the first character in the file
            //char ch = (char) System.in.read();
            //System.out.println("Output: " + ch);
            byte[] bytes = System.in.readNBytes(5);
            for (byte b: bytes
                 ) {
                System.out.print((char)b);
            }
        }
    }
