import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        //fibanocii series
        //logic take 0 and 1 and all no of terms
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
       if(n==0){
           System.out.println(a);
       }else if(n==1){
           System.out.println(a+" "+b);
       }else{
           System.out.print(a+" "+b+" ");
           while(n>2){
               int currentValue=a+b;
               System.out.print(currentValue+" ");
               a=b;
               b=currentValue;
               n--;
           }
       }
    }
}
