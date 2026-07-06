package DAY10.CLASSTASK;

public class Duplicates {
    public static void main(String[] args){
        String [] arr ={"sam","jane","sam","tom"};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals (arr[j]) && i!=j && i<j){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}