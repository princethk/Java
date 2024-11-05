import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        MobileDetails md[]=new MobileDetails[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(); sc.nextLine();
            int b=sc.nextInt(); sc.nextLine();
            String c=sc.nextLine();
            boolean d=sc.nextBoolean(); sc.nextLine();

            md[i]=new MobileDetails(a,b,c,d);
        }
        String brand=sc.nextLine();
        int ans=getTotalPrice(md,brand);
        System.out.println(ans);

        MobileDetails ans2=getSecondMin(md,brand);
        if(ans2!=null)
        System.out.println(ans2.getBrand()+":"+ans2.getPrice());
        else System.out.println("No cars");
    }
    public static int getTotalPrice(MobileDetails md[],String brand){
        int sum=0;
        for(int i=0;i<md.length;i++){
            if(md[i].getBrand().equalsIgnoreCase(brand)){
                sum+=md[i].getPrice();
            }
        }
        return sum;
    }
    public static MobileDetails getSecondMin(MobileDetails md[],String brand){
        ArrayList<MobileDetails>list=new ArrayList<MobileDetails>();
        for(MobileDetails m:md){
            if(m.getBrand().equalsIgnoreCase(brand))
                list.add(m);
        }
        list.sort(Comparator.comparingInt(MobileDetails::getPrice));
        return list.size()>=2?list.get(1):null;
    }


}
class MobileDetails{
    private int MobileId;
    private int Price;
    private String Brand;
    private boolean isFlagShip;

    MobileDetails(int MobileId,int Price,String Brand,boolean isFlagShip){
        this.Brand=Brand;
        this.MobileId=MobileId;
        this.Price=Price;
        this.isFlagShip=isFlagShip;
    }
    public int getPrice(){
        return Price;
    }
    public int getMobileId(){
        return MobileId;
    }
    public String getBrand(){
        return Brand;
    }
    public boolean getisFlagShip(){
        return isFlagShip;
    }
}