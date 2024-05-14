package setting.inter;

import model.BenhNhanThuong;
import setting.inter.BenhAn1;

import java.util.List;

public interface BenhAnThuong extends BenhAn1 {
    List findAll();
    void addBenhAn();
    void deleteBenhAn();
    BenhNhanThuong thuongInfo();

}
