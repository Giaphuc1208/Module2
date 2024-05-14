package model;

import java.time.LocalDate;

public abstract class BankAccount {
    public abstract String getInfo();
    private String idAccount;
    private String codeAccount;
    private String nameofAccountHolder;
    private LocalDate creatDate;

    public BankAccount() {
    }

    public BankAccount(String idAccount, String codeAccount, String nameofAccountHolder, LocalDate creatDate) {
        this.idAccount = idAccount;
        this.codeAccount = codeAccount;
        this.nameofAccountHolder = nameofAccountHolder;
        this.creatDate = creatDate;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameofAccountHolder() {
        return nameofAccountHolder;
    }

    public void setNameofAccountHolder(String nameofAccountHolder) {
        this.nameofAccountHolder = nameofAccountHolder;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDate creatDate) {
        this.creatDate = creatDate;
    }

    @Override
    public String toString() {
        return "BankAccount: idAccount='%s', codeAccount='%s', nameofAccountHolder='%s', creatDate=%s".formatted(idAccount, codeAccount, nameofAccountHolder, creatDate);
    }
}
