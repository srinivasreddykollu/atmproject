package handson;

import java.util.Scanner;

public class SumAverageOfArray {
      public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int n, sum=0;
            System.out.println("Enter the size of the array");
            n=scan.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elememts in array");
            for(int i=0;i< arr.length;i++){
                  arr[i]=scan.nextInt();
                  sum=sum+arr[i];
            }
            System.out.println("sum of elements in the array is "+sum);

      }


}
