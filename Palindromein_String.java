
import java.util.Scanner;

public class Palindromein_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(isPalindromic(arr[i]))
            System.out.println(arr[i]);
            
        }
       
    }
    static boolean isPalindromic(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            return false;
        }
        return true;
    }
}
