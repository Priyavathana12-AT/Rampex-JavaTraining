package DAY18;

import java.util.ArrayDeque;
import java.util.*;
class Deque {
    public static void main(String[] args){
        String[] task={"Download","Compile","Test","Deploy"};
        ArrayDeque<String> dq = new ArrayDeque<>();
        for(String t:task){
            dq.add(t);
        }
        for(String t:task){
            System.out.print(t+ "->"+" ");
        }
    }
}