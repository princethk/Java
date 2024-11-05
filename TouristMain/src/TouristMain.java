import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TouristMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Beach> beach=new ArrayList<>();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            beach.add(new Beach(a,b,c,d));
        }
        String str=sc.nextLine();
        int r=sc.nextInt();
        int ans=findLeastRatingWithName(beach,str,r);
        if(ans!=0){
            System.out.println(ans);
        }else System.out.println("No beach found");
    }
    public static int findLeastRatingWithName(ArrayList<Beach> beach,String str,int r){
        ArrayList<Integer>list=new ArrayList<>();
        for(Beach bc:beach){
            if(bc.getbeachName().equalsIgnoreCase(str) && bc.getbeachCost()>r){
                list.add(bc.getbeachrating());
            }
        }
        if(!list.isEmpty()) {
            Collections.sort(list);
            System.out.println(list);
            return list.get(0);
        }
        return 0;
    }
}
class Beach{
    private int beachId;
    private String beachName;
    private int beachRating;
    private int beachCost;
     public Beach(int beachId,String beachName,int beachRating,int beachCost){
         this.beachId=beachId;
         this.beachName=beachName;
         this.beachRating=beachRating;
         this.beachCost=beachCost;
     }
     public int getbeachId(){
         return beachId;
    }
    public String getbeachName(){
        return beachName;
    }
    public int getbeachrating(){
        return beachRating;
    }
    public int getbeachCost(){
        return beachCost;
    }
}