package controller.inter_iml.iml;

import controller.inter_iml.ChargeAccountIntf;
import controller.validate.RegexChoice;
import model.BankAccount;
import model.ChargeAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class ChargeAccountIml implements ChargeAccountIntf {
    public static final String PATH_ACCOUNT = "D:\\Dowload\\Module2\\baitap\\bankacount\\bankaccount\\src\\controller\\data\\bank_account.csv";
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        ArrayList<BankAccount> arrayList = new ArrayList<>();
        int check = RegexChoice.inputChoiceMenu();
        if(check == 1){
        
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void displayList() {

    }

    @Override
    public void searchList() {

    }

    @Override
    public ChargeAccount inputInfo() {
        return null;
    }

    @Override
    public void displayAll() {

    }
}
