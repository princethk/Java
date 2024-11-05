
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class setEmployees{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,String> emp=new LinkedHashMap<>();
        int n=sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            String city=sc.nextLine();
            emp.put(name,city);
        }
        System.out.println("Employee data:");

        for(Map.Entry<String,String>data:emp.entrySet()){
            System.out.println(data.getKey()+":"+data.getValue());

        }
        LinkedHashMap<String,String>updated=new LinkedHashMap<>();
        for(Map.Entry<String,String>data:emp.entrySet()){
            if(!updated.containsKey(data.getValue())){
                updated.put(data.getValue(),data.getKey());
            }else{
                updated.put(data.getValue(), updated.get(data.getValue())+","+data.getKey());
            }
        }
        for (Map.Entry<String,String> en : updated.entrySet()) {
            System.out.println(en.getKey()+":"+en.getValue());   
        }
    }
    
}
