package bankapplication;

public class BankAccountAppli {
    public static void main(String[] args){
        Checking chaccount1=new Checking("kollu","123456789",1500);
        Savings savaccount1=new Savings("thiru","987456123",2500);
        savaccount1.ShowInfo();
        System.out.println("+++++++++++++++++++++++++++++");
        chaccount1.ShowInfo();
    }
}
