package controller;

import model.BenhNhanThuong;
import setting.method.BenhNhanThuongImpl;

public class ThuongController {
    static int choice = -1;

    public static void thuongManager() {
        BenhNhanThuongImpl benhNhanThuong = new BenhNhanThuongImpl();
        System.out.println("1.\tThem moi benh nhan");
        System.out.println("2.\tXoa benh nhan");
        System.out.println("3.\tXem danh sach benh nhan");
        System.out.println("4.\tQuay lai menu chinh");
        System.out.println();
        switch (choice) {
            case 1:
                benhNhanThuong.addBenhAn();
                thuongManager();
                break;
            case 2:
                benhNhanThuong.deleteBenhAn();
                thuongManager();
                break;
            case 3:

        }
    }
}
