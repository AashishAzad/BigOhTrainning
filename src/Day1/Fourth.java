package Day1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  Write a function Boolean isValidURL(String url).

public class Fourth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String url = scn.nextLine();
        if (isValid(url)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static boolean isValid(String link){

        Pattern p = Pattern.compile(" \"^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))\" +\n" +
                "\"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)\" +\n" +
                "\"([).!';/?:,][[:blank:]])?$\";");
        Matcher m = p.matcher(link);
        if (m.find()){
            return true;
        }
        else{
            return false;
        }
    }
}
