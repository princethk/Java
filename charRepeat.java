
import java.util.Scanner;

public class charRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=str.charAt(0);
        int count=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
            else{
               // System.out.print(ch+""+count);
               sb.append(ch).append(count);
                ch=str.charAt(i);
                count=0;
                i--;
            }
            if(i==str.length()-1){
                //System.out.print(ch+""+count);
                sb.append(ch).append(count);
            }
            
        }
        System.out.println(sb.toString());
    }
}
