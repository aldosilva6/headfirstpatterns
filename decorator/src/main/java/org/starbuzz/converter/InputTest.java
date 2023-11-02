package org.starbuzz.converter;

import java.io.*;

/**
 * Created by ainacio on Nov, 2023
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))) {
                while ((c = in.read()) >= 0) {
                    System.out.print((char) c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
