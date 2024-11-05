import java.util.*;

public class courseMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Course co[]=new Course[4];
        for(int i=0;i<co.length;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble(); sc.nextLine();
            String d=sc.nextLine();
            boolean e=sc.nextBoolean(); sc.nextLine();

            co[i]=new Course(a,b,c,d,e);

        }
        double dble=sc.nextDouble(); sc.nextLine();
        String str=sc.nextLine();
        int ans=countCourse(co,str,dble);

        if(ans>0)
            System.out.println(ans);
        else
            System.out.println("no course found");

    }
    public static int countCourse(Course cr[],String str,double dble){
        int count=0;
        for(int i=0;i<cr.length;i++){
            if(cr[i].isHaveCertificate()==true && cr[i].getCourseRating()>=dble && cr[i].getMode().equalsIgnoreCase(str)){
                count++;
            }
        }
        return count;

    }
}
class Course{
    private int courseId;
    private String courseName;
    private double courseRating;
    String mode;
    private boolean haveCertificate;

    public Course(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseRating = courseRating;
        this.mode = mode;
        this.haveCertificate = haveCertificate;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }

    public boolean isHaveCertificate() {
        return haveCertificate;
    }

    public void setHaveCertificate(boolean haveCertificate) {
        this.haveCertificate = haveCertificate;
    }
}