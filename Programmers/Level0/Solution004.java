package Level0;

/*
- 더 크게 합치기 -
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 */

public class Solution004 {
    public static void main(String[] args) {
        Solution004 solution = new Solution004();
        System.out.println(solution.mySolution(1, 81));
    }

    public int mySolution(int a, int b) {
        int answer = 0;
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        int num1 = Integer.parseInt(result1);
        int num2 = Integer.parseInt(result2);

        return Math.max(num1, num2);

    }
}
