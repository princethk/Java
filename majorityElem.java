
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            map.put(a,map.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>n/2)
            System.out.println(m.getKey());
        }
    }
    
}
