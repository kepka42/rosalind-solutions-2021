package com.company;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class MyWriter {
    static FileWriter writer;

    static void goSave() {
        try {
            writer = new FileWriter("output.txt", StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void goSave(String fileType) {
        try {
            writer = new FileWriter("output." + fileType, StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quitRosalind() {
        try {
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeResult(char c) {
        try {
            writer.append(c);
        }
        catch(Exception ex) {

            ex.printStackTrace();
        }
    }

    public static void writeResult(String s) {
        try {
            writer.write(s);
        }
        catch(Exception ex) {

            ex.printStackTrace();
        }
    }
}