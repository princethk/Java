import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        Student st[]=new Student[n];

        for(int i=0;i<n;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            double d=(double)c/4;
            st[i]=new Student(a,b,c,d);
        }
        String ans1=findStudentWithHighestTotal(st);
        System.out.println(ans1.toUpperCase());

        ArrayList<Student> ans2=searchStudentsByPercentage(st);
        if(ans2!=null){
           for(int i=0;i< ans2.size();i++){
               System.out.print(ans2.get(i).getId());
           }
        }else System.out.println("No student > 70");
    }
    public static String findStudentWithHighestTotal(Student st[]){
        Student max=st[0];
        for(int i=1;i<st.length;i++){
            if(st[i].getTotmarksobt()> max.getTotmarksobt()){
                max=st[i];
            }
        }
        return max.getName();
    }
    public static ArrayList<Student>  searchStudentsByPercentage(Student st[]){
        ArrayList<Student> list=new ArrayList<Student>();
        for(int i=0;i<st.length;i++){
            if(st[i].getPer()>70)
                list.add(st[i]);
        }
        list.sort(Comparator.comparingDouble(Student::getPer));


        return list.size()>0?list:null;
    }
}
class Student{
    private int id;
    private String name;
    private int totmarksobt;
    private double per=(double)(totmarksobt/400);

    public Student(int id,String name,int totmarksobt,double per){
        this.name=name;
        this.id=id;
        this .totmarksobt=totmarksobt;
        this.per=per;
    }
    public int getId(){
        return id;
    }
    public int getTotmarksobt(){
        return totmarksobt;
    }
    public String getName(){
        return name;
    }
    public double getPer(){
        return per;
    }
}