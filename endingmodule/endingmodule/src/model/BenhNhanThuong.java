package model;

import java.time.LocalDate;

public class BenhNhanThuong extends BenhAn{
    private double phiNamVien;

    public BenhNhanThuong(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhNhanThuong(int stt, String maBenhAn, String maBenhNhan,String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String liDoNhapVien, double phiNamVien) {
        super(stt, maBenhAn, maBenhNhan,tenBenNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                "phiNamVien=" + phiNamVien +
                "} " ;
    }

    @Override
    public String getInfo(){
    return getStt() + getMaBenhAn() + getMaBenhnhan() + getTenBenNhan() + getNgayNhapVien() + getNgayRaVien() + getLiDoNhapVien()
            + getPhiNamVien();
    }
}
