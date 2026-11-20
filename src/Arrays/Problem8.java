package Arrays;

import java.util.Arrays;


public class Problem8 {
    public static void main(String[] args) {
        //without creating extra array
        //ee postion lo aina value we can insert
        //but we want one position extra so we take o
        //then everytime we move every element to eng then in empty postion we put our vale
       int []array={10,11,12,13,14,0};
       int position=0;
       int value=100;
       for(int i=array.length-2;i>=position;i--){
           array[i+1]=array[i];
       }
       array[position]=value;
        System.out.println(Arrays.toString(array));




    }
}
/*creation of extra array for element
int []array={10,11,12,13,14};
int position=3;
int value=100;
int [] newArray=new int[array.length+1];
       for(int i=0;i<position;i++){
newArray[i]=array[i];
        }
newArray[position]=value;
       for(int i=position;i<array.length;i++){
newArray[i+1]=array[i];

        }
        System.out.println(Arrays.toString(newArray));*/
