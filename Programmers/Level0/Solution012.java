package Level0;

import java.util.Scanner;

/*
- 소수 구하기 -
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
출력: 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class Solution012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] numArray = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            numArray[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (numArray[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= n; j = j + i) {
                numArray[j] = 0;
            }
        }

        for (int i = m; i <= n; i++) {
            if (numArray[i] != 0) {
                System.out.println(numArray[i]);
            }
        }
    }
}
