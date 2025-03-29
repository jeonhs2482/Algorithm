package Level0;

public class Solution007_1 {

    public static void main(String[] args) {
        Solution007_1 solution = new Solution007_1();
        System.out.println(solution.mySolution("abc1abc1abc"));
    }

    public String mySolution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer.toString();
    }
}
