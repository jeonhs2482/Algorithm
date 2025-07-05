package Level0;

/*
- 최빈값 찾기 -
랜덤한 숫자의 알파벳이 주어질 때, 이들 중 최빈값과 그 최빈값에 해당하는 알파벳을 출력하는 프로그램을 작성하시오.
 */
public class Solution009 {

    public static void main(String[] args) {
        Solution009 solution = new Solution009();
        solution.solution("aaaabbcccdeeefghhhhhhhhhhhhh");
    }

    public char solution(String str) {
        int[] alphabet_occurrence_array = new int[26];
        int max_occurrence = 0;
        int max_alphabet_index = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isLetter(currentChar)) {
                int arr_index = (int) currentChar - (int) 'a';
                alphabet_occurrence_array[arr_index] += 1;
            }
        }

        for (int i = 0; i < alphabet_occurrence_array.length; i++) {
            if (alphabet_occurrence_array[i] > max_occurrence) {
                max_occurrence = alphabet_occurrence_array[i];
                max_alphabet_index = i;
            }
        }

        return (char) ('a' + max_alphabet_index);
    }
}
