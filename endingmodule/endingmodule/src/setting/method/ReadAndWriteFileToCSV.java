package setting.method;

import model.BenhNhanThuong;
import model.BenhNhanVip;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static setting.validate.RegexBenhAn.dateInput;

public class ReadAndWriteFileToCSV {
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

    public static Map<BenhNhanThuong, Integer> readListThuongFromCSV(String pathFile) {
        List<BenhNhanThuong> benhNhanThuongList = new LinkedList<>();
        List<String> stringList = readListStringTOCSV(pathFile);
        for (String line : stringList) {
            String[] linked = line.split(",");
            BenhNhanThuong benhNhanThuong = new BenhNhanThuong(Integer.parseInt(linked[0]), linked[1], linked[2], linked[3], dateInput(linked[4])
                    , dateInput(linked[5]), linked[6], Double.parseDouble(linked[7]));
            benhNhanThuongList.add(benhNhanThuong);
        }
        return (Map<BenhNhanThuong, Integer>) benhNhanThuongList;
    }

    public static List<BenhNhanVip> readListVipFromCSV(String pathFile) {
        List<BenhNhanVip> benhNhanVipList = new ArrayList<>();
        List<String> stringList = readListStringTOCSV(pathFile);
        for (String line : stringList) {
            String[] array = line.split(",");
            BenhNhanVip benhNhanVip = new BenhNhanVip(Integer.parseInt(array[0]), array[1], array[2], array[3], dateInput(array[4]), dateInput(array[5]),
                    array[6], Boolean.parseBoolean(array[7]), array[8], array[9]);
            benhNhanVipList.add(benhNhanVip);
        }
        return benhNhanVipList;
    }

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

    public static void writeListThuongTOCSV(List<BenhNhanThuong> benhNhanThuongList2, String pathFile, boolean append) {
        List<String> stringList = new LinkedList<>();
        for (BenhNhanThuong benhNhanThuong : benhNhanThuongList2) {
            stringList.add(benhNhanThuong.getInfo());
        }
        writeListStringTOCSV(stringList, pathFile, append);
    }

    public static void writeListVipTOCSV(List<BenhNhanVip> benhNhanVipList2, String pathFile, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (BenhNhanVip benhNhanVip : benhNhanVipList2) {
            stringList.add(benhNhanVip.getInfo());
        }
        writeListStringTOCSV(stringList, pathFile, append);
    }
}
