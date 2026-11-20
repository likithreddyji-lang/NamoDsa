package Arrays;

public class Problem10 {
    public static void main(String[] args) {
        int[]arr={2,9,1,4,6};
        /*
        int max1=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2&&arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println(max2);*/

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println("Second largest is : "+second);

    }
}
