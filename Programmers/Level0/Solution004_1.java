package Level0;

public class Solution004_1 {
    public static void main(String[] args) {
        Solution004 solution = new Solution004();
        System.out.println(solution.mySolution(89, 8));
    }

    public int mySolution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt("" + a + b);
        int bLong = Integer.parseInt("" + b + a);

        answer = aLong > bLong ? aLong : bLong;
        return answer;
    }
}
