package Level0;

import java.util.ArrayList;

/*
- 반복되지 않는 문자 -
"abadabac"
다음과 같이 영어로 되어 있는 문자열이 있을 때, 이 문자열에서 반복되지 않는 첫번째 문자를
반환하시오. 만약 그런 문자가 없다면 _를 반환하시오. 
 */
public class Solution011 {

    public static void main(String[] args) {
        Solution011 solution = new Solution011();
        System.out.println(solution.solution("aabbbccddeeff"));
    }

    public char solution(String words) {
        int[] occurrenceArray = findAlphabetOccurrenceArray(words);

        ArrayList<Character> notRepeatingCharacterList = new ArrayList<>();

        for (int i = 0; i < occurrenceArray.length; i++) {
            if (occurrenceArray[i] == 1) {
                char oneChar = (char) ((int) 'a' + i);
                notRepeatingCharacterList.add(oneChar);
            }
        }
        for (int j = 0; j < words.length(); j++) {
            if (notRepeatingCharacterList.contains(words.charAt(j))) {
                return words.charAt(j);
            }
        }
        return '-';
    }

    public int[] findAlphabetOccurrenceArray(String str) {
        int[] alphabetOccurrenceArray = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int arrIndex = (int) str.charAt(i) - (int) 'a';
            alphabetOccurrenceArray[arrIndex] += 1;
        }
        return alphabetOccurrenceArray;
    }
}
