package com.heima_01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/sunkun/Desktop/Code/Java/myIo/src/com/heima_01/FileWriteDemo.java");

        int ch;

        while ((ch=fr.read())!=-1) {
            System.out.print((char)ch);
        }
    }
}
