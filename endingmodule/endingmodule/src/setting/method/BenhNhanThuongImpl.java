package setting.method;

import model.BenhNhanThuong;
import setting.inter.BenhAnThuong;
import setting.validate.RegexMenu;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static controller.ThuongController.thuongManager;
import static setting.method.ReadAndWriteFileToCSV.readListThuongFromCSV;
import static setting.method.ReadAndWriteFileToCSV.writeListThuongTOCSV;

public class BenhNhanThuongImpl implements BenhAnThuong {
    public static final String PATH_NORMAL = "D:\\Dowload\\Module2\\baitap\\endingmodule\\endingmodule\\src\\file\\benhnhanthuong.csv";
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public List findAll() {
        List<BenhNhanThuong> benhNhanThuongs = new LinkedList<>();
        return benhNhanThuongs;
    }

    @Override
    public void addBenhAn() {
        List<BenhNhanThuong> benhNhanThuongs = new LinkedList<>();
        benhNhanThuongs.add(thuongInfo());
        writeListThuongTOCSV(benhNhanThuongs, PATH_NORMAL, false);
        displayAll();
    }

    @Override
    public void deleteBenhAn() {
        List<BenhNhanThuong> benhNhanThuongs = (List<BenhNhanThuong>) readListThuongFromCSV(PATH_NORMAL);
        displayAll();
        System.out.println("You want delete ? \n" +
                "1.Yes\n" +
                "2.No");
        int check = RegexMenu.inputChoiceMenu();
        switch (check) {
            case 1:
                boolean isExits = false;
                System.out.println("Nhap ma benh an muon xoa: ");
                String delId = scanner.nextLine();
                for (int i = 0; i < benhNhanThuongs.size(); i++) {
                    if (benhNhanThuongs.get(i).getMaBenhAn().equals(delId)) {
                        benhNhanThuongs.remove(i);
                        writeListThuongTOCSV(benhNhanThuongs, PATH_NORMAL, false);
                        isExits = true;
                        break;
                    }
                }
                if (!isExits) {
                    System.out.println("Khong tim thay!!");
                    deleteBenhAn();
                }
                break;
            case 2:
                thuongManager();
                break;
            default:
                System.out.println("No choice!!");
                thuongManager();
        }


    }

    @Override
    public void displayList() {
        Map<BenhNhanThuong, Integer> benhNhanThuongIntegerMap = readListThuongFromCSV(PATH_NORMAL);
        System.out.println("Danh sach benh nhan: ");
        if (benhNhanThuongIntegerMap != null) {
            System.out.println("Benh nhan");
            for (BenhNhanThuong item : benhNhanThuongIntegerMap.keySet()) {
                System.out.println("Benh nhan thuong: " + item.toString() + "\t value: " + benhNhanThuongIntegerMap.get(item));
            }
        }
    }

    @Override
    public BenhNhanThuong thuongInfo() {
        int stt;

        return null;
    }

    @Override
    public void displayAll() {

    }
}
