package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filePath = "hust/soict/dsai/garbage/datafile.txt"; 
        byte[] fileBytes = new byte[0]; 
        long startTimeMillis, endTimeMillis;
        
        try {
            fileBytes = Files.readAllBytes(Paths.get(filePath));
            startTimeMillis = System.currentTimeMillis();

            String resultString = ""; 
            
            for (byte byteData : fileBytes) {
                resultString += (char) byteData; 
            }

            endTimeMillis = System.currentTimeMillis();
            System.out.println("Processing time using String concatenation (+): " + (endTimeMillis - startTimeMillis) + " ms");

            startTimeMillis = System.currentTimeMillis();

            StringBuffer stringBuffer = new StringBuffer(); 
            for (byte byteData : fileBytes) {
                stringBuffer.append((char) byteData); 
            }
            resultString = stringBuffer.toString(); 

            endTimeMillis = System.currentTimeMillis();
            System.out.println("Processing time using StringBuffer: " + (endTimeMillis - startTimeMillis) + " ms");

        } catch (IOException exception) {
            System.out.println("Error reading the file: " + exception.getMessage());
        }
    }
}
