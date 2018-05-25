package com.company;

public class depositAccount {
    private float currentBalaceUAH;
    private float currentBalaceDOL;
    private int depositAccountId;
    private String accountType = "Deposit Account";

    public depositAccount() {
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

    public int getDepositAccountId() {
        return depositAccountId;
    }

    public void setDepositAccountId(int depositAccountId) {
        this.depositAccountId = depositAccountId;
    }

    public String getAccounType() {
        return accountType;
    }
}