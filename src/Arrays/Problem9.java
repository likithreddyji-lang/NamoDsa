package Arrays;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        //2 things here position ante 1 nunchi start
        //for loop array 0 nunchi start so by solving problem check thse
        //memory lo aa elemnt untadi delete chesina but we only assume we deleted
        int []array={11,12,13,14,15};
        int position=3;
        for(int i=position;i<array.length;i++){
            array[i-1]=array[i];
        }
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }



    }
}
