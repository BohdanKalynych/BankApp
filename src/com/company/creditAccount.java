package com.company;

public class creditAccount {
    private float currentBalaceUAH;
    private float currentBalaceDOL;
    private int creditAccountId;
    private String accountType = "Credit Account";

    public creditAccount() {
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

    public int getCreditAccountId() {
        return creditAccountId;
    }

    public void setCreditAccountId(int creditAccountId) {
        this.creditAccountId = creditAccountId;
    }

    public String getAccountType() {
        return accountType;
    }
}
