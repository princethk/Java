
import java.util.Scanner;

public class maxDiagPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = findMax(arr);
        System.out.println(max);
    }

    static int findMax(int arr[][]) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i][i]) && arr[i][i] > max) {
                max = arr[i][i];
            }
            if(isPrime(arr[i][arr.length-i-1]) && arr[i][arr.length-i-1]>max){
                max=arr[i][arr.length-i-1];

            }
        }
        return max;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
