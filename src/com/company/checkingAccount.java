package com.company;

public class checkingAccount {
    private float currentBalaceUAH;
    private float currentBalaceDOL;
    private int checkingAccountId;
    private String accountType = "Checking Account";

    public checkingAccount() {
    }


    public float getCurrentBalaceUAH() {
        return currentBalaceUAH;
    }

    public void setCurrentBalaceUAH(float currentBalace) {
        this.currentBalaceUAH = currentBalace;
    }

    public float getCurrentBalaceDOL() {
        return currentBalaceDOL;
    }

    public void setCurrentBalaceDOL(float currentBalaceDOL) {
        this.currentBalaceDOL = currentBalaceDOL;
    }

    public int getCheckingAccountId() {
        return checkingAccountId;
    }

    public void setCheckingAccountId(int checkingAccountID) {
        this.checkingAccountId = checkingAccountID;
    }

    public String getAccountType() {
        return accountType;
    }
}
