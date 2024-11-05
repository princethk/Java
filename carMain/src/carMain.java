import java.util.*;
public class carMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car car[]=new Car[4];
        for(int i=0;i<car.length;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();

            car[i]=new Car(a,b,c,d);
        }
        String make=sc.nextLine();
        String model=sc.nextLine();
        Car ans1=findMostExpensiveCar(car);
        if(ans1!=null) {
            System.out.println(ans1.getModel());
            System.out.println(ans1.getMake());
            System.out.println(ans1.getYear());
            System.out.println(ans1.getPrice());
        }else{
            System.out.println("Car not available");
        }
        Car ans2=getCarByMakeAndModel(car,make,model);
        if(ans2!=null){
            System.out.println(ans2.getYear());
            System.out.println(ans2.getPrice());
        }

    }
    public static Car findMostExpensiveCar(Car car[]){
        double max=car[0].getPrice();
        Car c=car[0];
        for (int i=1;i<car.length;i++){
            if(car[i].getPrice()>max) {
                max = car[i].getPrice();
                c = car[i];
            }
        }
        return c;
    }
    public static Car getCarByMakeAndModel(Car car[],String make,String model){

        for(int i=0;i<car.length;i++){
            if(car[i].getModel().equalsIgnoreCase(model) && car[i].getMake().equalsIgnoreCase(make)){
                return car[i];
            }
        }
        return null;
    }
}
class Car{
    String make;
    String model;
    int year;
    double price;

    public Car(String make,String model,int year,double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}