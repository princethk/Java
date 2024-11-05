import java.util.*;
public class HeadSetsMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();sc.nextLine();
        HeadSets headSets[]=new HeadSets[4];

        for(int i=0;i<4;i++){
        String a=sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();sc.nextLine();
        boolean d=sc.nextBoolean();sc.nextLine();

        headSets[i]=new HeadSets(a,b,c,d);
        }
        String bran=sc.nextLine();
        int totalPrice=findTotalPriceForGivenBrand(headSets,bran);
        if(totalPrice!=0)
            System.out.println(totalPrice);
        else
            System.out.println("no headset avl with given brand");

        HeadSets hs=findAvailableHeadsetWithSecondMinPrice(headSets);
        if(hs!=null) {
            System.out.println(hs.getHeadsetName());
            System.out.println(hs.getPrice());
        }else {
            System.out.println("no headSets avl");
        }
    }
    public static int findTotalPriceForGivenBrand(HeadSets headSets[],String bran){
        int sum=0;
        for(int i=0;i<headSets.length;i++){
            if(headSets[i].getBrand().equalsIgnoreCase(bran))
                sum+=headSets[i].getPrice();
        }
        return sum;
    }
    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets headSets[]){
        for(int i=0;i<headSets.length-1;i++){
            for(int j=i+1;j< headSets.length;j++){
                if(headSets[i].getPrice()>headSets[j].getPrice()){
                    HeadSets k=headSets[i];
                    headSets[i]=headSets[j];
                    headSets[j]=k;
                }
            }
        }
        if(headSets[1].getAvailable()==true){
            return headSets[1];
        }else return null;

    }
}
class HeadSets{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName,String brand,int price,boolean available){
        this.headsetName=headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }
    public String getHeadsetName(){
        return headsetName;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public boolean getAvailable(){
        return available;
    }
}