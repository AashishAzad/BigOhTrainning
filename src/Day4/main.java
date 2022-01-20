package Day4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        StringUtils pb = new StringUtils();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(pb.reverseVowels(str));
//        char ch = sc.nextLine().charAt(0);
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        pb.subString(str,start,end);

//        String splitedString[] = pb.split(str,ch);
//        for (int i = 0; i < splitedString.length; i++) {
//            System.out.println(splitedString[i]);
//        }
    }
}
