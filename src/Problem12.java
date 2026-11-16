import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        //ap series numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=1;
        int diff=4;
        for(int i=1;i<=n;i++){
            sum=sum+num;
            num=num+diff;

        }
        System.out.println(sum);
    }
}
