package Level0;

/*
- 최빈값 찾기 -
랜덤한 숫자의 알파벳이 주어질 때, 이들 중 최빈값과 그 최빈값에 해당하는 알파벳을 출력하는 프로그램을 작성하시오.
 */
public class Solution009_1 {

    public static void main(String[] args) {
        Solution009_1 solution = new Solution009_1();
        solution.solution("aaaabbcccdeeefgh");
    }

    public void solution(String str) {
        char[] alphabet_array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int max_occurrence = 0;
        char max_alphabet = alphabet_array[0];

        for (char alphabet : alphabet_array) {
            int occurrence = 0;

            for (int i = 0; i < str.length(); i++) {
                char c =  str.charAt(i);

                if (c == alphabet) {
                    occurrence ++;
                }
            }

            if (max_occurrence < occurrence) {
                max_occurrence = occurrence;
                max_alphabet = alphabet;
            }
        }
        System.out.println("max_alphabet = " + max_alphabet);
        System.out.println("max_occurrence = " + max_occurrence);
    }
}
