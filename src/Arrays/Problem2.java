package Arrays;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arraySum = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element"+i);
            arraySum[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arraySum[i];
        }
        System.out.println(sum);
    }
}
