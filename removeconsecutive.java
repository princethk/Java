
import java.util.Scanner;

public class removeconsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        char ch='\0';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch) {
                result=result+ch;
                ch=str.charAt(i);
        }
    }
    System.out.println(result);
}
}
