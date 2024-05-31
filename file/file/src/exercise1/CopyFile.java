package exercise1;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try{
            File soureFile = new File("D:\\Dowload\\Module2\\baitap\\file\\file\\src\\exercise1\\sourceFile.txt");
            File targerFile = new File("D:\\Dowload\\Module2\\baitap\\file\\file\\src\\exercise1\\targetFile.txt");
            FileReader source = new FileReader(soureFile);
            FileWriter target = new FileWriter(targerFile);
            BufferedReader bufferedReader = new BufferedReader(source);
            String line;
            BufferedWriter bufferedWriter =new BufferedWriter(target);

            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
