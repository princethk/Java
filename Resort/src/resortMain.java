import java.util.Scanner;

public class resortMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Resort resort[]=new Resort[4];

        for(int i=0;i<resort.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();
            double e=sc.nextDouble(); sc.nextLine();

            resort[i]=new Resort(a,b,c,d,e);
        }
        String str=sc.nextLine();
        double ans=findAvgPrice(resort,str);
        if(ans!=0){
            System.out.println("The avg Price of "+str+":"+ans);
        }
        else{
            System.out.println("no resorts are available");
        }
    }
    public static double findAvgPrice(Resort resort[],String str){
        int sum=0,n=0;
        for(int i=0;i<resort.length;i++){
            if(resort[i].getCategory().equalsIgnoreCase(str) && resort[i].getResortRating()>4){
                sum+=resort[i].getResortPrice();
                n++;
            }
        }
        if(n>0){
            double avg=sum/n;
            return avg;
        }
        return 0;
    }
}
class Resort{
    int resortId;
    String resortName;
    String category;
    double resortPrice;
    double resortRating;

    public Resort(int resortId, String resortName, String category, double resortPrice, double resortRating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public int getResortId() {
        return resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getResortPrice() {
        return resortPrice;
    }

    public void setResortPrice(double resortPrice) {
        this.resortPrice = resortPrice;
    }

    public double getResortRating() {
        return resortRating;
    }

    public void setResortRating(double resortRating) {
        this.resortRating = resortRating;
    }
}