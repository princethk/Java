
import java.util.Scanner;

public class sum_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 9) {
            System.out.println(n); 
        }else {
            int sum = Sum(n);
            System.out.println(sum);
        }
    }

    static int Sum(int n) {
        int num = n;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        if (sum > 9) {
            return Sum(sum);
        }
        return sum;

    }

}
