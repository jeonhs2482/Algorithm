package Level0;
import java.util.Scanner;

public class Solution004_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                System.out.print((char)(c + 32));
            }
            else {
                System.out.print((char)(c - 32));
            }
        }
    }
}
