package setting.validate;

import java.awt.geom.Arc2D;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class RegexBenhAn {
    static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_MABENHAN = "([A-B])[0-9]{3}";
    private static final String REGEX_TENBENNHAN = "(^[\\w'\\-,.][^0-9_!¡?÷?¿/\\+=@#$%ˆ&*(){}|~<>;:]{2,}$)";
    private static final String REGEX_LIDONHAPVIEN = "([a-z])\\w+";
    private static final String REGEX_MABENHNHAN = "([B-N])[0-9]{3}";
    private static final String REGEX_UUDAI = "([a-z])\\w+";

    public static LocalDate dateInput(String doctorInput) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(doctorInput, dateTimeFormatter);
    }



    public static boolean inputLoaiVip() {
        System.out.println("Nhap loai vip: ");
        String newVip = scanner.nextLine();
        if (Objects.equals(newVip, "vip 1")) {
            return true;
        }
        return false;
    }

    public static String inputFullname() {
        System.out.println("Enter your first and last name: ");
        String fullName = scanner.nextLine();
        while (!fullName.matches(REGEX_TENBENNHAN)) {
            System.err.println("Ban da nhap sai dinh dang!!");
            fullName = scanner.nextLine();
        }
        return fullName;
    }

    public static String inputMaBenhAn() {
        System.out.println("Nhap ma benh an:  ");
        String maBenhAn = scanner.nextLine();
        while (!maBenhAn.matches(REGEX_MABENHNHAN)) {
            try {
                System.out.println("Sai cu phap!!(Vi du : BA-XXX)");
                maBenhAn = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.err.println("Sai cu phap, hay nhap lai!!");
            }
        }
        return maBenhAn;
    }

    public static String inputMaBenhNhan() {
        System.out.println("Nhap ma benh nhan:  ");
        String maBenhNhan = scanner.nextLine();
        while (!maBenhNhan.matches(REGEX_MABENHAN)) {
            try {
                System.out.println("Sai cu phap!!(Vi du : BN-XXX)");
                maBenhNhan = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.err.println("Sai cu phap, hay nhap lai!!");
            }
        }
        return maBenhNhan;
    }

    public static String inputUuDai() {
        System.out.println("Nhap uu dai: ");
        String uuDai = scanner.nextLine();
        while (!uuDai.matches(REGEX_UUDAI)) {
            System.err.println("Ban nhap sai dinh dang!!");
            uuDai = scanner.nextLine();
        }
        return uuDai;
    }

    public static String inputLido() {
        System.out.println("Nhap li do: ");
        String lido = scanner.nextLine();
        while (!lido.matches(REGEX_LIDONHAPVIEN)) {
            System.err.println("Ban nhap sai dinh dang!!");
            lido = scanner.nextLine();
        }
        return lido;
    }

    public static Double inputPhiNamVien() {
        double phiNamVien;
        do {
            try {
                System.out.println("Enter phi nam vien: ");
                phiNamVien = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e){
            System.out.println("Nhap gia tien lon hon 0!!");
            phiNamVien = -1.0;
            }
        } while (phiNamVien <= 0.0);
            return phiNamVien;
    }




}
