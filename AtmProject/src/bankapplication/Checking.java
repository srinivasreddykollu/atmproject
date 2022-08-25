package bankapplication;

public class Checking extends Account{
    int debitCardNumber;
    int debitcardPin;
    public Checking(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber="2"+accountNumber;
        SetDebitCard();
    }
    private void SetDebitCard(){
         debitCardNumber=(int)(Math.random()*Math.pow(10,12));
         debitcardPin=(int)(Math.random()*Math.pow(10,4));
    }
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("your checking account savings:"+
                "\n Debit card number : "+debitCardNumber+
                "\n Debit card PIN : "+debitcardPin);
    }
}
