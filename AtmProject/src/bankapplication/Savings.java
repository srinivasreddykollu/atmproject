package bankapplication;

public class Savings extends Account{
    //List properties specific to the savings account
    int safetyDepositBoxId;
    int safetyDepositBoxkey;
    public Savings(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber="1"+accountNumber;
        safetyDepositBox();

    }
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Your Savings Account Features :"+
               "\n safety deposit box ID :"+safetyDepositBoxId+
                "\n safety deposit box Key :"+safetyDepositBoxkey);
    }

    //constructor to initialize the settings of savings account
    //list the methods specific to the savings account
    public void safetyDepositBox(){
        safetyDepositBoxId=(int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxkey=(int)(Math.random()*Math.pow(10,4));
    }

}
