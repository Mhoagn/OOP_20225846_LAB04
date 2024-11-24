package hust.soict.dsai.garbage;

import java.io.*;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileInputStream fileStream = new FileInputStream("datafile.txt");
            int byteData;
            while ((byteData = fileStream.read()) != -1) {
                stringBuilder.append((char) byteData);
            }
            fileStream.close();
            String completeString = stringBuilder.toString();
            System.out.println("File read successfully and data has been converted into a string.");
            System.out.println("File content:\n" + completeString);
        } catch (IOException e) {
            System.out.println("Unable to open the file: " + e.getMessage());
        }
    }
}
