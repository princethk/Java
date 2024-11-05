
import java.util.Scanner;

public class smallestChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>c){
                c=str.charAt(i);
            }
        }
        System.out.println(c);
    }
    
}
