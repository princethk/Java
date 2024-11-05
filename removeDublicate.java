
import java.util.HashSet;
import java.util.Scanner;

public class removeDublicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    
}
