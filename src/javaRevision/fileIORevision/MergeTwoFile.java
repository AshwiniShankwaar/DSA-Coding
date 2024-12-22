package javaRevision.fileIORevision;

import java.io.*;

public class MergeTwoFile {
    public static void main(String[] args) {
        File file = new File("abc","text.txt");
        File file2 = new File("abc","text2.txt");
        try{
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            String line = breader.readLine();
            FileWriter writer = new FileWriter(file2,true);
            PrintWriter pwriter = new PrintWriter(writer);

            while (line != null){
                pwriter.println(line);
                line = breader.readLine();
            }
            pwriter.flush();
            pwriter.close();
            breader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
