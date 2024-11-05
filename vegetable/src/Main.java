import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vegetable veg[]=new Vegetable[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            veg[i]=new Vegetable(a,b,c,d);
        }
        int rate=sc.nextInt();sc.nextLine();
        Vegetable ans=findMinimumPriceByRating(veg,rate);
        if(ans!=null)
            System.out.println(ans.getVegetableId());
        else
            System.out.println("No vegetable found");
    }
    public static Vegetable findMinimumPriceByRating(Vegetable veg[],int r){
//        ArrayList<Integer> list= new ArrayList<Integer>();
//        for(int i=0;i<veg.length;i++){
//            if(veg[i].getRating()>r){
//                list.add(veg[i].getPrice());
//            }
//        }
//        if(list.size()>0) {
//            Collections.sort(list);
//
//            for(int i=0;i< veg.length;i++){
//                if(veg[i].getPrice()==list.get(0)){
//                    return veg[i];
//                }
//            }
//        }
//        return null;
//    }
        Vegetable minPriceVeg = null;

        for(int i = 0; i < veg.length; i++) {
            if(veg[i].getRating() > r) {
                if(minPriceVeg == null || veg[i].getPrice() < minPriceVeg.getPrice()) {
                    minPriceVeg = veg[i];
                }
            }
        }

        return minPriceVeg;
    }
}
class Vegetable{
    private int VegetableId;
    private String VegetableName;
    private int Price;
    private int Rating;

    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        this.VegetableId = vegetableId;
        this.VegetableName = vegetableName;
        this.Price = price;
        this.Rating = rating;
    }

    public int getVegetableId() {
        return VegetableId;
    }

    public String getVegetableName() {
        return VegetableName;
    }

    public int getPrice() {
        return Price;
    }

    public int getRating() {
        return Rating;
    }
}