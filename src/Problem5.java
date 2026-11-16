import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //ee question konchem diff bcz indulo  even numbers no of we are priniting
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int sum=0;
        int i=2;
        int count=1;
        while(count<=n){
            sum+=i;
            i+=2;
            count++;
        }
        System.out.println(sum);

    }
}
