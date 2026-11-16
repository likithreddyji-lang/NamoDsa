import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        //multiplication table
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
}
