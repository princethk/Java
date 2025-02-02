import java.util.*;

public class newspaperMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Newspaper np[]=new Newspaper[4];

        for(int i=0;i< np.length;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            int d=sc.nextInt();

            np[i]= new Newspaper(a,b,c,d);
        }
        int pubyr=sc.nextInt(); sc.nextLine();
        String name=sc.nextLine();

        int totalPrice=findTotalPriceByPublicationYear(np,pubyr);
        if(totalPrice!=0)
            System.out.println(totalPrice);
        else
            System.out.println("No newspaper found with the mentioned attribute");

        Newspaper obj=searchNewspaperByName(np,name);
        if(obj!=null)
        {
            System.out.println("regNo-"+obj.getRegNo());
            System.out.println("name-"+obj.getName());
            System.out.println("Publication Year-"+obj.getPublicationYear());
            System.out.println("Price-"+obj.getPrice());
        }
        else
            System.out.println("No Newspaper found with given name");
    }
    public static int findTotalPriceByPublicationYear(Newspaper np[],int pubyr){
        int total=0;
        for(int i=0;i< np.length;i++){
            if(np[i].getPublicationYear()==pubyr)
                total+=np[i].getPrice();

        }
        if(total>0)
            return total;
        return 0;

    }
    public static Newspaper searchNewspaperByName(Newspaper np[],String name){
        for (int i=0;i<np.length;i++){
            if(np[i].getName().equalsIgnoreCase(name))
                return np[i];
        }
        return null;
    }
}
class Newspaper{
    int regNo;
    String name;
    int publicationYear;
    int price;

    public Newspaper(int regNo, String name, int publicationYear, int price) {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}