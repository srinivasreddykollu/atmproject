package bankapplication;

public abstract class Account implements IBaseRate {
    //List common properties
    String name;
    double balance;
    String accountNumber;
    static int index=10000;
    String sSN;
    double rate;

    public Account(String name,String sSN,double initDeposit){
        this.name=name;
        this.sSN=sSN;
        balance=initDeposit;
        index++;
        this.accountNumber=SetAccountNumber();
    }
    public String SetAccountNumber(){
        String lastTwoofSSN=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID=index;
        int randomNumber=(int)(Math.random()*Math.pow(10,3));
        return lastTwoofSSN+uniqueID+randomNumber;
    }
    public void ShowInfo(){
        System.out.println("Name: "+name+
        "\nAccountNumber: "+accountNumber+
        "\nBalance: "+balance);
    }

    //constructor to initialize the properties and objects
    //list out common properties
}
