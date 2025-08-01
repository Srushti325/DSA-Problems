/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
import java.util.*;
public class ValidAnagrams {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int check [] = new int [26];

        for(int i=0; i<s.length(); i++) {
            check[s.charAt(i) - 'a']++;
            check[t.charAt(i) - 'a']--;
        }

        for(int value : check) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.next();

        System.out.print("Enter string t: ");
        String t = sc.next();

        System.out.println("Is Anagram: " + isAnagram(s, t));
    }
}
