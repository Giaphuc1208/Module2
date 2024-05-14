package setting.validate;

import model.BankAccount;
import model.ChargeAccount;
import model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import static setting.validate.RegexDay.inputDate;

public class ReadAndWriteCSV {
   /**/ public static ArrayList<BankAccount> readFromFile(String pathFile) {
       ArrayList<BankAccount> accounts = new ArrayList<>();
        try{
            File file = new File(pathFile);
            if(!file.exists()){
                try {
                    throw new FileNotFoundException();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch ()
   }

    private static void writeListStringToCSV(ArrayList<String> stringList, String pathFile, boolean append){
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
            System.err.println("Err file!!");
        }
    }

    public static void writeListChargeAccountTOCSV(ArrayList<BankAccount> charge, String pathFile, boolean append){
       ArrayList<String> strings = new ArrayList<>();
       for (BankAccount bankAccount : charge){
           strings.add(bankAccount.getInfo());
       }
       writeListStringToCSV(strings,pathFile,append);
    }
}

/*String[] data = line.split(",");
                if (data.length == 6) {
        accounts.add(new ChargeAccount(data[0], data[1], data[2], inputDate(data[3]), (data[4]), (data[5])));
        } else {
        accounts.add(new SavingAccount(data[0], data[1], data[2], inputDate(data[3]), (data[4]),
inputDate(data[5]), data[6], Integer.parseInt(data[7])));*/
