package javaProjectSG;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\S4406022\\Desktop\\ss.txt");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

