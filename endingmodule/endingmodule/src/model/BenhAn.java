package model;

import java.time.LocalDate;

public abstract class BenhAn {
    private int stt;
    private String maBenhAn;
    private String maBenhnhan;
    private String tenBenNhan;
    private LocalDate ngayNhapVien;
    private LocalDate ngayRaVien;
    private String liDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int stt, String maBenhAn,String maBenhnhan, String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String liDoNhapVien) {
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.maBenhnhan = maBenhnhan;
        this.tenBenNhan = tenBenNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.liDoNhapVien = liDoNhapVien;
    }

    public String getMaBenhnhan() {
        return maBenhnhan;
    }

    public void setMaBenhnhan(String maBenhnhan) {
        this.maBenhnhan = maBenhnhan;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenNhan() {
        return tenBenNhan;
    }

    public void setTenBenNhan(String tenBenNhan) {
        this.tenBenNhan = tenBenNhan;
    }

    public LocalDate getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(LocalDate ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public LocalDate getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(LocalDate ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLiDoNhapVien() {
        return liDoNhapVien;
    }

    public void setLiDoNhapVien(String liDoNhapVien) {
        this.liDoNhapVien = liDoNhapVien;
    }

    @Override
    public String toString() {
        return "Benh An{" +
                "stt=" + stt +
                ", ma benh an= '" + maBenhAn + '\'' +
                ", ma benh nhan= " + maBenhnhan + '\'' +
                ", ten ben nhan='" + tenBenNhan + '\'' +
                ", ngay nhap vien=" + ngayNhapVien +
                ", ngay ra vien=" + ngayRaVien +
                ", li do nhap vien='" + liDoNhapVien + '\'' +
                '}';
    }

    public abstract String getInfo();
}
