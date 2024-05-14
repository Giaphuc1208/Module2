package model;

import java.time.LocalDate;

public class SavingAccount extends BankAccount{
    private String savingMoney;
    private LocalDate savingsMoneyDate;
    private String interestRate;
    private int period;

    public SavingAccount(String savingMoney, LocalDate savingsMoneyDate, String interestRate, int period) {
        this.savingMoney = savingMoney;
        this.savingsMoneyDate = savingsMoneyDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SavingAccount(String idAccount, String codeAccount, String nameofAccountHolder, LocalDate creatDate, String savingMoney, LocalDate savingsMoneyDate, String interestRate, int period) {
        super(idAccount, codeAccount, nameofAccountHolder, creatDate);
        this.savingMoney = savingMoney;
        this.savingsMoneyDate = savingsMoneyDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public String getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(String savingMoney) {
        this.savingMoney = savingMoney;
    }

    public LocalDate getSavingsMoneyDate() {
        return savingsMoneyDate;
    }

    public void setSavingsMoneyDate(LocalDate savingsMoneyDate) {
        this.savingsMoneyDate = savingsMoneyDate;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SavingAccount: " + super.toString() +
                "savingMoney='" + savingMoney + '\'' +
                ", savingsMoneyDate=" + savingsMoneyDate +
                ", interestRate='" + interestRate + '\'' +
                ", period=" + period;
    }

    @Override
    public String getInfo(){
        return getIdAccount() + "," + getCodeAccount() + "," + getNameofAccountHolder() + "," + getCreatDate() + "," + getSavingMoney() + "," +
                getSavingsMoneyDate() + "," + getInterestRate() + "," + getPeriod();
    }
}
