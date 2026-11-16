import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        //series sum we want two buckets here to store modified terms each time
        //to store sum each time
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int term=0;
        int sum=term;
        for(int i=1;i<=n;i++){
            term=term*10+9;
            sum+=term;
        }
        System.out.println(sum);

    }
}
