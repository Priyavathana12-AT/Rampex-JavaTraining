package DAY7.CLASSWORK;

public class ArraySecondMax {
    public static void main(String[] args){
        int nums[]={1,2,3,4,5};
        int Smax=0;
        int max=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>max){
                Smax=max;
                max=nums[i];
            }
        }
        System.out.println("the second maximun value: "+Smax);
    }
}
