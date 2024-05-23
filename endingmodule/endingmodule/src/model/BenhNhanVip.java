package model;

import java.time.LocalDate;

public class BenhNhanVip extends BenhAn {
    private boolean loaiVip;
    private String uuDai;
    private String thoiHanVip;

    public BenhNhanVip(boolean loaiVip, String uuDai, String thoiHanVip) {
        this.loaiVip = loaiVip;
        this.uuDai = uuDai;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhNhanVip(int stt, String maBenhAn,String maBenhNhan ,String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String liDoNhapVien, boolean loaiVip, String uuDai, String thoiHanVip) {
        super(stt, maBenhAn, maBenhNhan ,tenBenNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.loaiVip = loaiVip;
        this.uuDai = uuDai;
        this.thoiHanVip = thoiHanVip;
    }

    public boolean isLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(boolean loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        if(isLoaiVip()) return "BenhNhanVip{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", uuDai='" + uuDai + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                "} ";
        else{
            return "BenhNhanVip{" + super.toString() +
                    "loaiVip='" + loaiVip + '\'' +
                    ", uuDai='" + uuDai + '\'' +
                    ", thoiHanVip='" + thoiHanVip + '\'' +
                    "} ";
        }
    }

    @Override
    public String getInfo(){
    return getStt() + getMaBenhAn() + getMaBenhnhan() +getTenBenNhan() + getNgayNhapVien() + getNgayRaVien() + getLiDoNhapVien()
            + isLoaiVip() + getUuDai() + getThoiHanVip();
    }
}
