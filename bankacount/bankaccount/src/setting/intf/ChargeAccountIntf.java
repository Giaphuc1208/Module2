package setting.intf;

import model.ChargeAccount;

public interface ChargeAccountIntf extends Service{
    void add();
    void delete();
    void displayList();
    void searchList();
    ChargeAccount inputInfo();
}
