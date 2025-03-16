package Level0;

public class Solution005_1 {
    public static void main(String[] args) {
        Solution005_1 solution = new Solution005_1();
        System.out.println(solution.mySolution(7));
    }

    public int mySolution(int n) {
        int answer = 0;

        for(int i = n; i >= 0; i -= 2)
            answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }
}
