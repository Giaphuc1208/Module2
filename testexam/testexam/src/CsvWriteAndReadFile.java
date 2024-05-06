import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvWriteAndReadFile {
    private static final String FILE_PATH ="D:\\Dowload\\Module2\\baitap\\testexam\\testexam\\src\\product.csv";
    public static void readFile(){
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.readLine();
            String line ;
            while ((line = bufferedReader.readLine()) != null ){
                String[] data = line.split(",");
                Product product = new Product(data[0],data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]),data[4]);
                ProductManager.productList.add(product);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : ProductManager.productList){
                String line = product.getCode() + "," + product.getName() + "," + product.getPrice() + "," + product.getQuantity() + "," + product.getDescription();
                bufferedWriter.newLine();
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
