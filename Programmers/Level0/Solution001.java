package Level0;
import java.util.Scanner;

/*
- 대소문자 바꿔서 출력하기 -
영어 알파벳으로 이루어진 문자열 str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
*/

public class Solution001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            }
        }
        System.out.println(result);
        sc.close();
    }
}
