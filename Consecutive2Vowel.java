
import java.util.Scanner;

public class Consecutive2Vowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toLowerCase();
        String str[] = st.split(" ");
        int count=0;
        for (String s:str) {
            for (int j = 1; j < s.length(); j++) {
                if (isVowel(s.charAt(j - 1)) == true && isVowel(s.charAt(j)) == true) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }

        return false;
    }
}
