package dsalgo.bigo;

import java.util.Arrays;
import java.util.List;

/**
 * Link To Problem:- <a href="https://www.interviewbit.com/problems/pangram-check/">...</a>
 *
 *
 * Given a sentence represented as an array A of strings that contains all lowercase alphabets.
 * Chech if it is a pangram or not.
 * A pangram is a unique sentence in which every letter of the lowercase alphabet is used at least once.
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 * 1 <= Ai <= 5
 *
 * Input Format
 * Given an array of strings A.
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * A = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"]
 * Input 2:
 *
 * A = ["interviewbit", "scaler"]
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 0
 */
public class PangramCheck {
    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog")));
    }
    public static int solve(List<String> inputList) {
        boolean[] arr = new boolean[26];
        for (String s : inputList) {
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; ++i) {
            if (!arr[i]) {
                return 0;
            }
        }
        return 1;

    }
}
