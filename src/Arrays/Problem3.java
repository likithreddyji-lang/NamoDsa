package Arrays;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowSize=sc.nextInt();
        int columnSize=sc.nextInt();
        int [][] array2=new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            System.out.println("enter"+i+"row");
            for(int j=0;j<columnSize;j++){
                System.out.println("enter"+i+"row"+j+" elements");
                array2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<array2.length;i++){
            int eachRow=array2[i].length;
            for(int j=0;j<eachRow;j++){
                System.out.println(array2[i][j]);
            }
        }

    }
}
