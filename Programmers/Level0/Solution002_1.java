package Level0;

public class Solution002_1 {

    public static void main(String[] args) {
        Solution002 solution = new Solution002();
        System.out.println(solution.mySolution("He11oWor1d", "lloWorl", 2));
    }

    public String mySolution(String my_string, String overwrite_string, int s) {
        char[] my_chars = my_string.toCharArray();
        char[] overwrite_chars = overwrite_string.toCharArray();

        for (int i = 0; i < overwrite_chars.length; i++) {
            my_chars[s + i] = overwrite_chars[i];
        }
        return String.valueOf(my_chars);
    }
}
