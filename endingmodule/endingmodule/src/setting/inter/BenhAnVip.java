package setting.inter;

import model.BenhNhanVip;
import setting.inter.BenhAn1;

import java.util.List;

public interface BenhAnVip extends BenhAn1 {
    List findAll();
    void addVip();
    void deleteVip();
    BenhNhanVip vipInfo();

}
