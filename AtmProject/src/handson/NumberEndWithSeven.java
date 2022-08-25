package handson;

import java.util.Scanner;

public class NumberEndWithSeven {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start=scan.nextInt();
        System.out.println("Enter the ending number");
        int end=scan.nextInt();
        for(int i=start;i<end;i++){
            if(i%10==7){
                System.out.println("Number end with 7 "+i);
            }
        }
    }
}
