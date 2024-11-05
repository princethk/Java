
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class mergeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String arr1[]=s1.split(",");
        String arr2[]=s2.split(",");

        String arr[]=new String[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[arr1.length+i]=arr2[i];
        }

        String n=Arrays.toString(arr);
        String k=n.substring(1,n.length()-1);
        System.out.println(n);
        System.out.println(k);
        //System.out.println(arr);
    }
    
}
