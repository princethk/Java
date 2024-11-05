
import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         //int num = n;
         int sum=0;
        // int count = 0, sum = 0;
        // while (n > 0) {
        //     n = n / 10;
        //     count++;
        // }
        // n=num;
        // while (num > 0) {
        //     int rem = num % 10;
        //     sum += Math.pow(rem, count);
        //     num = num / 10;
        // }
       
        String str=Integer.toString(n);
        int i=0;
        while (i<str.length()) {
            sum+=Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),str.length());
            i++;
        }
         if(n==sum)
        System.out.println("Armstrong");
        else{
            System.out.println("Not Arm");
        }

        sc.close();
    }

}
