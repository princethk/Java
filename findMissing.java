
import java.util.Scanner;

public class findMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int num;
        for(int i=0;i<n-1;i++){
            num=arr[i];
            while(num+1!=arr[i+1]){
                System.out.print(num+1 +" ");
                num++;
            }
        }
    }
    
}
