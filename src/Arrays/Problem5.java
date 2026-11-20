package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //mistake;new array size eche tapudu we may use array.length-1it is not correct
        //we only wanted to normal arr.lengthncz it starts from 1
       int[] array={10,11,12,13};
       int p=array.length;
       int[]array1={14,15,16,17};
       int q=array1.length;
       int sum=p+q;
        int []newArray=new int[sum];
        int n=array.length;
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
            newArray[n]=array1[i];
            n++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
