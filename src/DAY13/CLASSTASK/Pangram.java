package DAY13.CLASSTASK;
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word:");
        String s = sc.nextLine();
        int count  = 0;
        for(int i = 0;i< s.length();i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            System.out.println(s.charAt(i) + ": " + count);
            count = 0;
        }
    }
}

