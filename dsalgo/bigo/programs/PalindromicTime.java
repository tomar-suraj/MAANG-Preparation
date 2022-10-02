package dsalgo.bigo.programs;

/**
 * Given a string A which represents a time in 24 hour HH:MM format.
 * Find the minimum number of minutes need to pass to reach palindromic time.
 * Let some time be XY:ZW then it is palindromic if X == W and Y == Z.
 *
 * Problem Constraints
 * String A represents a valid time in HH:MM format.
 *
 * Input Format
 * Given a string A.
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * A = "23:59"
 * Input 2:
 * A = "21:00"
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 12
 *
 * Example Explanation -
 * Explanation 1:
 * After 1 minute time will be 00:00 which is a palindromic time.
 * Explanation 2:
 * After 12 minute time will be 21:12 which is a palindromic time.
 *
 */
public class PalindromicTime {
    public static void main(String[] args) {
        System.out.println(solve("23:59"));
    }


    public static int solve(String A) {
        String[] arr = A.split(":");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int time = 0;
        while (!(hr % 10 == min / 10 && hr / 10 == min % 10)) {
            time++;
            min++;
            if (min == 60) {
                hr++;
                min = 0;
            }

            if (hr == 24) {
                hr = 0;
            }
        }

        return time;

    }
}
