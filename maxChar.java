public class maxChar {
    public static void main(String[] args) {
        String str="aman";
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<ch)
            ch=str.charAt(i);

        }
        System.out.println(ch);
    }
    
}
