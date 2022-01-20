package Day4;


/*Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(findLengthOfLongestSubstring(str));
    }

    public static int findLengthOfLongestSubstring(String str){
        int length = 1;
        Set<Character> ch = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if(!ch.contains(str.charAt(i))){
                ch.add(str.charAt(i));
            }
        }

        String temp = "";
        for (char elem : ch){
            temp += elem;
        }

        Set<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder(temp);
        for (int i = 0; i < temp.length(); i++) {
            for (int j = temp.length(); j >=i ; j--) {
                System.out.println(sb.substring(i,j));
                set.add(sb.substring(i,j));
            }
        }
        for (String elem : set ){
            if(elem.length()>length){
                length = elem.length();
            }
        }
        return length;
    }
}
