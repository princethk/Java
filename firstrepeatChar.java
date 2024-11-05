
import java.util.Scanner;

public class firstrepeatChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
