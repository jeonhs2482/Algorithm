package Level0;

/*
- 문자열 겹쳐쓰기 -
문자열 my_string, overwrite_string과 정수 s가 주어집니다.
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class Solution002 {

    public static void main(String[] args) {
        Solution002 solution = new Solution002();
        System.out.println(solution.mySolution("He11oWor1d", "lloWorl", 2));
    }

    public String mySolution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}
