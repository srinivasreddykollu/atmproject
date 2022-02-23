package miniproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;
    private double currentBalance = 1000.0;
    private double savingBalance = 5000.0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCurrentWithdraw(double amount) {
        currentBalance = (currentBalance - amount);
        return currentBalance;

    }

    public double calcCurrentDeposit(double amount) {
        currentBalance = (currentBalance + amount);
        return currentBalance;
    }

    public double calcSavingsWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcSavingsDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCurrentWithdrawAmount() {
        System.out.println("current Account Balance :" + moneyFormat.format(currentBalance));
        System.out.println("Enter Amount you want to withdraw from current Account");
        double amount = input.nextDouble();
        if ((currentBalance - amount) >= 0) {
            calcCurrentWithdraw(amount);
            System.out.println("Your transaction is successful");
            System.out.println("The new current Account Balance :" + moneyFormat.format(currentBalance));
        } else {
            System.out.println("Current Account Balance cannot be Negative");
        }
    }

    public void getCurrentDepositAmount() {
        System.out.println("current Account Balance :" + moneyFormat.format(currentBalance));
        System.out.println("Enter Amount you want to Deposit to your current Account");
        double amount = input.nextDouble();
        if ((currentBalance + amount) >= 0) {
            calcCurrentDeposit(amount);
            System.out.println("Your transaction is successful");
            System.out.println("The new current Account Balance :" + moneyFormat.format(currentBalance));
        } else {
            System.out.println("Current Account Balance cannot be Negative");
        }
    }

    public void getSavingWithdrawAmount() {
        System.out.println("current Account Balance :" + moneyFormat.format(savingBalance));
        System.out.println("Enter Amount you want to withdraw from saving Account");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingsWithdraw(amount);
            System.out.println("Your transaction is successful");
            System.out.println("The new current Account Balance :" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Current Account Balance cannot be Negative");
        }
    }

    public void getSavingDepositAmount() {
        System.out.println("current Account Balance :" + moneyFormat.format(savingBalance));
        System.out.println("Enter Amount you want to withdraw from current Account");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingsDeposit(amount);
            System.out.println("Your transaction is successful");
            System.out.println("The new saving Account Balance :" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Current Account Balance cannot be Negative");
        }
    }
}