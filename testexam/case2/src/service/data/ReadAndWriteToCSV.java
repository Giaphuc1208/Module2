package service.data;

import model.guest.Guest;
import model.guest.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static service.validate.Validator.dateInputDOB;

public class ReadAndWriteToCSV {

    private static void writeListStringTOCSV(List<String> stringList, String pathFile, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Err File!!!");
        }
    }
    public static void writeListStaffTOCSV(List<Staff> employeeList, String pathFile, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Staff staff : employeeList) {
            stringList.add(staff.getInfo());
        }
        writeListStringTOCSV(stringList, pathFile, append);
    }

    public static void writeListCustomerToCSV(List<Guest> guestList, String pathFile, boolean append) {
        List<String> stringList = new LinkedList<>();
        for (Guest guest : guestList) {
            stringList.add(guest.getInfo());
        }
        writeListStringTOCSV(stringList, pathFile, append);
    }

    private static List<String> readListStringTOCSV(String pathFile) {
        List<String> listString = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Err File!!!");
        }
        return listString;
    }
    public static List<Guest> readListCustomerTOCSV(String pathFile) {
        List<Guest> guestList = new LinkedList<>();
        List<String> stringList = readListStringTOCSV(pathFile);
        for (String line : stringList) {
            String[] linked = line.split(",");
            Guest guest = new Guest(linked[0], dateInputDOB(linked[1]), Boolean.parseBoolean(linked[2]), linked[3], linked[4]
                    , linked[5], linked[6], linked[7], linked[8]);
            guestList.add(guest);
        }
        return guestList;
    }

    public static List<Staff> readListStaffTOCSV(String pathFile) {
        List<Staff> staffList = new ArrayList<>();
        List<String> stringList = readListStringTOCSV(pathFile);
        for (String line : stringList) {
            String[] array = line.split(",");
            Staff staff = new Staff(array[0], dateInputDOB(array[1]), Boolean.parseBoolean(array[2]), array[3],
                    array[4], array[5], array[6], array[7], Double.parseDouble(array[8]), array[9]);
            staffList.add(staff);
        }
        return staffList;
    }

}
