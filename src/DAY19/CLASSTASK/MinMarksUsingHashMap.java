package DAY19.CLASSTASK;

import java.util.HashMap;
import java.util.Map;

public class MinMarksUsingHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Ram",56);
        hm.put("Lachu",86);
        hm.put("Diya",96);
        hm.put("Anu",76);

        int min=Integer.MAX_VALUE;
        String name="";
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            if(e.getValue()<min){
                min= e.getValue();
                name=e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);
    }
}
