package Level0;

/*
- 최빈값 찾기 -
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 */
public class Solution009_2 {

    public static void main(String[] args) {
        Solution009_2 solution = new Solution009_2();
        int[] arr = {1, 3, 5, 5, 7, 7, 5, 7};
        System.out.println(solution.solution(arr));
    }

    public int solution(int[] array) {

        int maxNumber = 0;
        int maxCount = 0;
        int count = 0;
        int answer = 0;

        // 최빈값 카운트를 담을 배열을 생성하기 위해 주어진 배열의 최대값을 찾음
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        // 주어진 배열의 최대값 + 1 만큼의 배열 생성 (여기에 발생한 빈도 수 담을 예정)
        int[] countArray = new int[maxNumber + 1];

        // 주어진 배열을 순회하면서 발생한 빈도만큼 새로 생성한 배열 인덱스에 +1 해줌
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]] ++;
        }

        // 새로 생성한 배열 순회하면서 최대 값(최대 빈도 값) 찾음
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                answer = i;
            }
        }

        // 최대 값이 두개 이상인지 확인
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == maxCount) {
                count++;
            }
        }

        // 두개 이상이라면 -1 반환 아니면 해당 값 반환
        if (count > 1) {
            return -1;
        } else {
            return answer;
        }
    }
}
