package Arrays;

public class Problem11 {
    public static void main(String[] args) {
        int []array={10,11,12,13,14,15};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max1){
                max2=max1;
                max1=array[i];
            }else{
                if(array[i]>max2&&array[i]!=max1){
                    max2=array[i];
                }
            }

        }
        System.out.println(max2);


    }
}
