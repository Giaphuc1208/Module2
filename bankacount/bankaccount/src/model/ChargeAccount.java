package model;

import java.time.LocalDate;

public class ChargeAccount extends BankAccount{
    private String bankAccountNumber;
    private String balance;

    public ChargeAccount(String bankAccountNumber, String balance) {
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public ChargeAccount(String idAccount, String codeAccount, String nameofAccountHolder, LocalDate creatDate, String bankAccountNumber, String balance) {
        super(idAccount, codeAccount, nameofAccountHolder, creatDate);
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ChargeAccount: " + super.toString() +
                "bankAccountNumber='" + bankAccountNumber + '\'' +
                ", balance='" + balance;
    }

    @Override
    public String getInfo() {
        return getIdAccount() + "," + getCodeAccount() + "," + getNameofAccountHolder() + "," + getCreatDate() + "," + getBankAccountNumber() + "," + getBalance();
    }
}
