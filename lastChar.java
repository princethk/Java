
import java.util.Scanner;

class lastChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans=ans+str.charAt(i-1);
            }
        }
        ans+=str.charAt(str.length()-1);
        System.out.println(ans);
    }
}