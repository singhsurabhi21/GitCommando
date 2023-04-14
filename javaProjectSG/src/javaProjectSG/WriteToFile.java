package javaProjectSG;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\S4406022\\\\Desktop\\\\ss.txt");
            String content = "Hello, world!";
            fos.write(content.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

