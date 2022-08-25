package miniproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("###,##.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() {
        int x = 1;
        do {
            try {
                data.put(123456, 2479);
                data.put(987654, 7730);
                System.out.println("Welcome to the ATM Services!");
                System.out.println("Please Enter Your Account Number!");
                setAccountNumber(menuInput.nextInt());
                System.out.println("Please Enter Your Four Digit Pin!");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid Characters entered");
                x = 2;
            }

            int cn = getAccountNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else
                System.out.println("Wrong pin or account number entered");
        } while (x == 1) ;
        }

    public void getAccountType() {
        System.out.println("Please select the Account type");
        System.out.println("Type 1 Current Account");
        System.out.println("Type 2 Savings Account");
        System.out.println("Type 3 Exit");
        int selection = menuInput.nextInt();


        switch (selection) {
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for visiting the ATM");
                break;
        }
    }

    public void getCurrent() {
        System.out.println("Current Account");
        System.out.println("Type 1 view Balance");
        System.out.println("Type 2 Withdraw Funds");
        System.out.println("Type 3 Deposit Funds");
        System.out.println("Type 4 Exit");

        int check = menuInput.nextInt();
        switch (check) {
            case 1:
                System.out.println("current Account Balance :" + moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawAmount();
                getAccountType();
                break;
            case 3:
                getCurrentDepositAmount();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting the ATM");
                break;
        }
    }

    public void getSaving() {
        System.out.println("savings Account");
        System.out.println("Type 1 view Balance");
        System.out.println("Type 2 Withdraw Funds");
        System.out.println("Type 3 Deposit Funds");
        System.out.println("Type 4 Exit");

        int check = menuInput.nextInt();
        switch (check) {
            case 1:
                System.out.println("savings Account Balance :" + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawAmount();
                getAccountType();
                break;
            case 3:
                getSavingDepositAmount();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting the ATM");
                break;
        }
    }
}

