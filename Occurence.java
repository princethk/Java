import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Occurence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().replace(" ", "");
        LinkedHashMap<Character,Integer> count=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            count.put(str.charAt(i),count.getOrDefault(str.charAt(i),0)+1);

        }
      for(HashMap.Entry<Character,Integer>data: count.entrySet()){
        System.out.println(data.getKey()+":"+data.getValue());
      }
    }
}