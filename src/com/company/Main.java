package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please select which type of account you want to create");
        System.out.println("1. Checking account");
        System.out.println("2. Credit account");
        System.out.println("3. Deposit account");
        Scanner accountTypeScanner = new Scanner(System.in);

        checkingAccount newCheckingAccount = new checkingAccount();

        depositAccount newDepositAccount = new depositAccount();

        int accountTypeInput = accountTypeScanner.nextInt();
        switch (accountTypeInput) {
            case 1:
                //checkingAccount newCheckingAccount = new checkingAccount();
                System.out.println("Please enter starting UAH balance ");
                Scanner sc = new Scanner(System.in);
                newCheckingAccount.setCurrentBalaceUAH(sc.nextFloat());

                System.out.println("Please enter starting DOL balance");
                newCheckingAccount.setCurrentBalaceDOL(sc.nextFloat());
                Random random = new Random();

                newCheckingAccount.setCheckingAccountId(random.nextInt(1000));

                System.out.println("You have just created Checking account");
                System.out.println("Account type: " + newCheckingAccount.getAccountType() + "  Account id: " + newCheckingAccount.getCheckingAccountId() + "  UAH Balance: " + newCheckingAccount.getCurrentBalaceUAH() + "  DOL Balance: " + newCheckingAccount.getCurrentBalaceDOL());

            case 2:
                System.out.println("You have just created Credit account");

            case 3:
                if (newCheckingAccount.getCheckingAccountId()!= 0) {
                    //depositAccount newDepositAccount = new depositAccount();
                    System.out.println("Please enter starting UAH balance ");
                    Scanner sc1 = new Scanner(System.in);
                    newDepositAccount.setCurrentBalaceUAH(sc1.nextFloat());

                    System.out.println("Please enter starting DOL balance");
                    newDepositAccount.setCurrentBalaceUAH(sc1.nextFloat());
                    Random random1 = new Random();

                    newDepositAccount.setDepositAccountId(random1.nextInt(1000));

                    System.out.println("You have just created Deposit account");
                    System.out.println("Account type: " + newDepositAccount.getAccounType() + "  Account id: " + newDepositAccount.getDepositAccountId() + "  UAH Balance: " + newDepositAccount.getCurrentBalaceUAH() + "  DOL Balance: " + newDepositAccount.getCurrentBalaceDOL());
                } else System.out.println("You need to create 'Checking Account' first");



        }
    }
}
