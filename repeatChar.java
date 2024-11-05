
import java.util.Scanner;


public class repeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i+=2){
            char ch=str.charAt(i);
            int count=Character.getNumericValue(str.charAt(i+1));

            for(int j=0;j<count;j++){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
    
}
