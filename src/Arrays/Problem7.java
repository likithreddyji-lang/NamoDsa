package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        //odd and even elements
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("odd elements are ");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]);
            }
        }
        System.out.println();
        System.out.println("even elements are");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                System.out.print( array[i]+" ");
            }
        }
        System.out.println();

    }
}
