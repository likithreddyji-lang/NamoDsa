package Arrays;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int []array1=new int[size];
        //creation of array
        for(int i=0;i<size;i++){
            System.out.println("enter the vale of"+i);
            array1[i]=sc.nextInt();
        }
        //traversal of array
        for(int i=0;i<size;i++){
            System.out.println(array1[i]);
        }
        //random acess of array
        System.out.println(array1[4]);//fifth element bcz array starts with 0
    }
}
