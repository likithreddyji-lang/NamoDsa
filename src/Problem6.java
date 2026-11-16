import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //harmonic series
        //float anedi endhuku ante harmonic series manaku value 0.5 ela points lo vastadi
        //if int eithe 0 laga tesukoni decimal ni ignore chestadi if output wanna correct
        //use float for num or deno so to avoid ignoring of decimal
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum+=(float)1/i;
        }
        System.out.println(sum);
    }
}
