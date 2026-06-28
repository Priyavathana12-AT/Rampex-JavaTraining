package DAY7.CLASSWORK;

public class ArrayEvenSum{
    public static void main(String[] args){
        int[]arr={1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<5;i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
