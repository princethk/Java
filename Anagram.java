import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

       if(isAnagram(str1, str2))
       System.out.println("Anagram");
       else 
       System.out.println("Not Anagram");
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
        return false;
        char ch1[]=str1.toLowerCase().toCharArray();
        char ch2[]=str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       // return Arrays.equals(ch1, ch2);

       for(int i=0;i<ch1.length;i++){
        if(ch1[i]!=ch2[i])
        return false;
       }
       return true;
       }

    }
