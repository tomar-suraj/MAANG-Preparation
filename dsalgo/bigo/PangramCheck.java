package dsalgo.bigo;

import java.util.Arrays;
import java.util.List;

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
