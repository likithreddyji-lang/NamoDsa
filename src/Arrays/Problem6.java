package Arrays;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //max and min of array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element"+ i);
            array[i]=sc.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
