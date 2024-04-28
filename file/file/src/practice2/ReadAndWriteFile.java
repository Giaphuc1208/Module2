package practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath){
        List<Integer> number = new ArrayList<>();
        try{
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = br.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e){
            System.out.println("Error");
        }
        return number;
    }

    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max is: " + max);
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/practice2/max.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/practice2/result.txt", maxValue);
    }
}
