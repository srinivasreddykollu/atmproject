package handson;

import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scan.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in the array");
        //Reading elements from the user
        for(int i=0;i<length;i++){
            arr[i]=scan.nextInt();
        }
        //printing the elements in the array
        for(int j=0;j<length;j++){
            System.out.println(arr[j]);
        }
        //finding max and min in the array
        int max=arr[0];
        int min=arr[0];
        for(int k=0;k<length;k++){
            if(max<arr[k]){
                max=arr[k];
            }
            if(min>arr[k]){
                min=arr[k];
            }
        }
        System.out.println("system founded max in array is "+max+" and min in array is "+min);
    }
}
