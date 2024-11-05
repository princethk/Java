import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();

       Employee emp[]=new Employee[n];
       for(int i=0;i<n;i++){
           int a=sc.nextInt();
           sc.nextLine();
           String b=sc.nextLine();
           String c=sc.nextLine();
           int d=sc.nextInt();sc.nextLine();
           int e=sc.nextInt(); sc.nextLine();

           emp[i]=new Employee(a,b,c,d,e);
       }
       int sal=sc.nextInt(); sc.nextLine();
       String dept=sc.nextLine();
       String ans1[]=findDept(emp,sal);
       if(ans1!=null){
           String dep=Arrays.toString(ans1);
           String d=dep.substring(1,dep.length()-1);
           System.out.println(d);
       }else{
           System.out.println("No dept found");
       }

       int ans2=findSecondHighestSalary(emp,dept);
       if(ans2!=0){
           System.out.println(ans2);
       }
       else System.out.println("No data found");

    }
    public static String[] findDept(Employee emp[],int sal){
        String[] d=new String[0];
        for(int i=0;i<emp.length;i++){
            if(emp[i].getSalary()==sal && emp[i].getRating()>=3){
                d=Arrays.copyOf(d,d.length+1);
                d[d.length-1]=emp[i].getDept();
            }
        }
        if(d.length>0)
            return d;
        return null;
    }
    public static int findSecondHighestSalary(Employee emp[],String dept){
        int sal[]=new int[0];
        for(int i=0;i<emp.length;i++){
            if(emp[i].getDept().equalsIgnoreCase(dept)){
                sal=Arrays.copyOf(sal,sal.length+1);
                sal[sal.length-1]=emp[i].getSalary();
            }
        }
        if(sal.length>0){
            Arrays.sort(sal);
            return sal[sal.length-2];
        }
        return 0;
    }
}
class Employee{
    private int EmpId;
    private String EmpName;
    private String Dept;
    private int Rating;
    private int Salary;

    public Employee(int EmpId,String EmpName,String Dept,int Rating,int Salary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Dept = Dept;
        this.Rating = Rating;
        this.Salary = Salary;
    }
        public int getEmpId(){
            return EmpId;
        }
        public String getEmpName(){
            return EmpName;
        }
        public String getDept(){
            return Dept;
        }
        public int getRating(){
            return Rating;
        }
        public int getSalary(){
            return Salary;
        }

}