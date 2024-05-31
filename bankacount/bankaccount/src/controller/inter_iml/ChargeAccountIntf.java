package controller.inter_iml;

import model.ChargeAccount;

import java.util.Scanner;

public interface ChargeAccountIntf extends Service{
    void add();
    void delete();
    void displayList();
    void searchList();
    ChargeAccount inputInfo();
}
