package finalexam;

import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int[] count = new int[26];

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[ch - 'a']++;
            }
        }

        int odd = 0;
        for (int c : count) {
            if (c % 2 == 1)
                odd++;
        }

        System.out.println(odd <= 1 ? "Possible" : "Impossible");
    }
}
