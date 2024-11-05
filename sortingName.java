
import java.util.Scanner;

public class sortingName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name[]=new String[n];
        String s="";
        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(name[i].compareTo(name[j])>0){
                    s=name[j];
                    name[j]=name[i];
                    name[i]=s;
                }
            }
        }
        for(String st:name)
        System.out.println(st);
    }
    
}
