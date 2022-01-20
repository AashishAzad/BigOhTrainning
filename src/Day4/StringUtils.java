package Day4;

import java.util.Scanner;

public class StringUtils {

    public static int countChar(String str, char ch){

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                return i+1;
            }
        }
        return -1;
    }

    public static String subString(String str, int start, int end){
        String res = "";
        for (int i = start; i < end ; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    public static String[] split(String str, char ch){
        int count=0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        String[] strArray = new String[count];
        int strArrayLoc = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                temp += str.charAt(i);
                strArray[strArrayLoc] = temp;
                strArrayLoc++;
                temp = "";
            }
            else{
                temp += str.charAt(i);
            }
        }
        return strArray;
    }

    public static boolean hasPattern(String str, String pattern){

        boolean res = false;

        if(str.length()!=pattern.length()){
            return false;
        }
        else{
            String patternCheck = check(pattern);

            String strCheck = check(str);

            if (strCheck.length()!= patternCheck.length()){
                return false;
            }
            else{
                int i = 1;
                while(i <= strCheck.length()){
                    if(strCheck.charAt(i) == patternCheck.charAt(i)){
                        res = true;
                    }
                    else{
                        return false;
                    }
                    i = i+2;
                }
            }
        }
        return res;
    }

    public static boolean allWordsContains(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
            else if(str.charAt(i) == ' '){
                 if (count==0){
                     return  false;
                 }
                 else{
                     count = 0;
                 }
            }
            else if(i == str.length()-1){
                if (count==0){
                    return  false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    public static String check(String str){

        String temp = "";
        int count = 1;

        for (int i = 0; i < str.length()-1 ; i++) {
            if(str.charAt(i)!=str.charAt(i+1)){
                temp += str.charAt(i) + Integer.toString(count);
                count = 1;
            }
            else{
                count += 1;
            }
        }
        temp += str.charAt(str.length()-1) + Integer.toString(count);
        return temp;
    }

    public static void reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < (sb.length()/2); i++) {
            char ch = sb.charAt(i);
//            sb.charAt(i) = sb.charAt(sb.length()-1-i);
        }

    }

    public static String reverseVowels(String str){

        int countVowels = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'
                    || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O' || str.charAt(i)=='U'){
                countVowels++;
            }
        }

        char[] vowels = new char[countVowels];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'
                    || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O' || str.charAt(i)=='U'){
                vowels[j] = str.charAt(i);
                j++;
            }
        }

        j = vowels.length-1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'
                    || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O' || str.charAt(i)=='U'){
                res += vowels[j];
                j--;
            }
            else{
                res += str.charAt(i);
            }
        }
        return res;
    }

}
