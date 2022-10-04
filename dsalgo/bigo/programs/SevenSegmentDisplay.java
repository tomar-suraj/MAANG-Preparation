package dsalgo.bigo.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * link -> <a href="https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/">...</a>
 *
 * Alice got a number written in seven segment format where each segment was creatted used a matchstick.
 *
 * Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.
 * Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks
 * that she currently possess.Help Alice out by telling her that number.
 *
 * Input Format:
 * First line contains T (test cases).
 * Next T lines contain a Number N.
 *
 * Output Format:
 * Print the largest possible number numerically that can be generated using at max that many number of matchsticks
 * which was used to generate N.
 *
 * Sample Input
 * 2
 * 1
 * 0
 * Sample Output
 * 1
 * 111
 *
 * Explanation
 * If you have 1 as your number that means you have 2 match sticks.You can generate 1 using this.
 * If you have 0 as your number that means you have 6 match sticks.You can generate 111 using this.
 *
 */
public class SevenSegmentDisplay {
    public static void main(String args[]) throws Exception {
        final int[] digits = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());

        while (cases > 0) {
            String num = "";
            int sum = br.readLine().chars().map(i -> digits[i - '0']).sum();

            if (sum % 2 == 1) {
                num = "7";
                sum = sum - 3;
            }

            sum = sum / 2;
            for (int i = 0; i < sum; ++i) {
                num = num + 1;
            }
            System.out.println(num);

            cases--;

        }
    }
}
