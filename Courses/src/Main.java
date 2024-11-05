import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        Course course[]=new Course[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            int e=sc.nextInt(); sc.nextLine();

            course[i]=new Course(a,b,c,d,e);
        }
        String crAdmin=sc.nextLine();
        int handsOn=sc.nextInt(); sc.nextLine();

        int ans1=findAvg(course,crAdmin);
        System.out.println(ans1);

        ArrayList<Course> ans2=sortCourseByHandsOn(course,handsOn);
        if(ans2!=null)
            for(Course c: ans2)
                System.out.println(c.getCourseName());
        else System.out.println("No course found");
    }
    public static int findAvg(Course cr[],String crAdmin){
        int sum=0;
        int count=0;
        for(int i=0;i<cr.length;i++){
            if(cr[i].getCourseAdmin().equalsIgnoreCase(crAdmin)){
                sum+=cr[i].getQuiz();
                count++;
            }
        }
        if(count>0)
            return (int)sum/count;
        else return 0;
    }
    public static ArrayList<Course> sortCourseByHandsOn(Course course[],int handsOn){
        ArrayList<Course> list=new ArrayList<>();
        for(Course c:course){
            if(c.getHandson()<handsOn){
                list.add(c);
            }
        }
        list.sort(Comparator.comparing(Course::getHandson));
        if(list.size()>0)
            return list;
        else return null;
    }
}
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int handson;
    private int quiz;

    Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
        this.courseAdmin=courseAdmin;
        this.courseName=courseName;
        this.courseId=courseId;
        this.quiz=quiz;
        this.handson=handson;
    }
    public int getCourseId(){
        return courseId;
    }
    public int getHandson(){
        return handson;
    }
    public int getQuiz(){
        return quiz;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseAdmin(){
        return courseAdmin;
    }
}