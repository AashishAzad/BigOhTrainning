package Test;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String ans = "";
        int i = 0;          //Current index of String1
        int j = 0;          //Current index of String2

        getInterleavings(str1,str2,ans,i,j);
    }

    public static void getInterleavings(String str1, String str2, String ans, int i, int j){

        /* It means that resultant string has length = str1.length()+str2.length()
            and we have achieved a InterLeaving.
         */
        if(i==str1.length() && j==str2.length()){
            System.out.println(ans);
        }

        // Recursive call to get all possible Interleavings

        if (i<str1.length()){
            getInterleavings(str1,str2,ans+str1.charAt(i),i+1,j);
        }
        if (j<str2.length()){
            getInterleavings(str1,str2,ans+str2.charAt(j),i,j+1);
        }
    }
}
