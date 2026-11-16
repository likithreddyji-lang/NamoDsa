public class Problem8 {
    public static void main(String[] args) {
        //amstrong number
        //logic is we want no of count then multiply each number with that count then sum if final ansewer is equalto main anser  wqual
        int n=1634;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int sum=0;

        while(temp>0){
            int rem=temp%10;
            int power=1;
            for(int i=0;i<=count;i++){
                power=power*rem;
            }
            sum+=power;
            temp=temp/10;

        }
        if(temp==sum){
            System.out.println("it is an amestrong");
        }else{
            System.out.println("it is not an amestrong");
        }


    }
}
