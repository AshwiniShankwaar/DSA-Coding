package javaRevision.fileIORevision;

import java.io.*;

public class DemoFile {
    public static void main(String[] args) {
//        File file = new File("abc");
//        file.mkdir();
        File file = new File("abc");
        file.mkdir();
        if(file.exists() && file.isDirectory()) {
            try{
                File temp = new File("abc","text.txt");
                if(temp.isFile() && temp.exists())
                    System.out.println("file exits");
                else temp.createNewFile();

                System.out.println("file is present putting data in file");
//                FileWriter writer = new FileWriter(new File("abc","text.txt"));
//                for(char c = 'a';c<='z';c++){
//                    writer.write(c);
//                }
//                writer.write("hello from demo data to the file\nlets see how thw\nfile manupulation work");
//                writer.flush();
//                writer.close();

//                BufferedWriter bwriter = new BufferedWriter(writer);
//                bwriter.write("hello from demo data to the file");
//                bwriter.newLine();
//                bwriter.write("hello from demo data");
//                bwriter.flush();
//                bwriter.close();

                PrintWriter out = new PrintWriter(temp);
                out.println("hello from demo data to the file");
                out.println("let see the data in file working");
                out.flush();
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            File f = new File("abc","text.txt");

            try {
//                char[] data = new char[(int) f.length()];
                FileReader reader = new FileReader(f);
                BufferedReader breader = new BufferedReader(reader);
                String line = breader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = breader.readLine();
                }
//                reader.read(data);
//                int i = reader.read();
//
//                while (i != -1){
//                    char alpha = (char)i;
//                    System.out.println(alpha);
//                    i = reader.read();
//                }
//                for(char x : data){
//                    System.out.println(x);
//                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }




    }
}
