package controller.inter_iml;

import model.SavingAccount;

public interface SavingAccountIntf extends Service{
    void add();
    void deleteEmployee();
    void displayList();
    void searchEmployee();
    SavingAccount inputInfo();

}
