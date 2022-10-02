package dsalgo.bigo.programs;

/**
 * Given a string A. The string contains alphanumeric characters.
 * Find the sum of all numbers present in it.
 * Note: All the numbers will fit in a 32-bit signed integer.
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * Input Format
 * The first and only argument is a string A.
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * A = "a12b34c"
 * Input 2:
 * A = "123"
 *
 *
 * Example Output
 * Output 1:
 * 46
 * Output 2:
 * 123
 *
 * Example Explanation -
 * Explanation 1:
 * The numbers are 12, 34.
 * 12 + 34 = 46
 * Explanation 2:
 * The only number is 123.
 *
 */
public class ExtractingNumbers {
    public static void main(String[] args) {
        System.out.println(solve("a12b34c"));
    }

    public static Long solve(String input) {
        char[] arr = input.toCharArray();
        long num = 0;
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i])) {
                num = num * 10 + Character.getNumericValue(arr[i]);
            } else {
                total = total + num;
                num = 0;
            }
        }
        return total + num;
    }

    private static boolean isNumber(char c) {
        return Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <= 9;
    }
}
