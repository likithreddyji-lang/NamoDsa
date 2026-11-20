package Arrays;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int []arr={15,10,12};
        //copy the elements and reverse of elements
        int []arr2=new int[arr.length];
        int n=0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[n]=arr[i];
            n++;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
