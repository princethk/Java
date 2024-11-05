
import java.util.Scanner;

public class NonRcharSub{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
           for(int j=i+1;j<str.length();j++){
            if(i==j)
            sb.append(str.charAt(i));
            else{
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    break;
                }
            }
           }   
           if(count>0)
           break;
        }
        System.out.println(sb);
    }
}
