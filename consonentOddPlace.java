
import java.util.Scanner;

public class consonentOddPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if((i+1)%2!=0 && !s.contains(Character.toString(s.charAt(i))) && str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}
