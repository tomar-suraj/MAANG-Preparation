package dsalgo.bigo.programs;

import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array A of length N. Where Ai is the cost of stepping on the ith stair.
 * From ith stair, you can go to i+1th or i+2th numbered stair.
 * Initially, you are at 1st stair find the minimum cost to reach Nth stair.
 *
 * Problem Constraints
 * 2 <= N <= 105
 * 1 <= Ai <= 104
 *
 * Input Format
 * The first and only argument is an integer array A.
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 1, 3]
 * Input 2:
 * A = [1, 2, 3, 4]
 *
 * Example Output
 * Output 1:
 * 5
 * Output 2:
 * 7
 *
 * Example Explanation -
 * Explanation 1:
 * 1 -> 3 -> 4
 * Explanation 2:
 * 1 -> 2 -> 4
 *
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(1, 2, 3, 4)));
    }

    public static int solve(List<Integer> inputList) {
        int n = inputList.size();
        int start = inputList.get(0);
        int[] cost = new int[n];
        cost[0] = start;
        cost[1] = start + inputList.get(1);
        for (int i = 2; i < n; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + inputList.get(i);
        }
        return cost[n - 1];
    }
}
