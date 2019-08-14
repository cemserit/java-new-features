package com.cemserit.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by cemserit on 2019-06-15.
 */
public class NewFileApiNIO {
    public static void main(String[] args) {
        String filename = "file.txt";
        String content = "text";

        write(filename, content);
        read(filename);
    }

    private static void write(String filename, String content) {
        try {
            Path path = Paths.get(filename);
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(String filename) {
        try {
            Path path = Paths.get(filename);
            String content = new String(Files.readAllBytes(path));
            System.out.println("File: " + filename);
            System.out.println("Content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
