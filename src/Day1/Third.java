package Day1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";

        for (int i = num; i > 0 ; i++) {
            String res = Integer.toString(i);
            char ar[] = new char[res.length()];
            for (int j = 0; j < ar.length; j++) {
                ar[j] = res.charAt(j);
            }
            for (int j = 0; j < ar.length; j++) {
                if(ar[j]=='1'||ar[j]=='2'||ar[j]=='3'||ar[j]=='5'||ar[j]=='7'){
                    str += ar[j];
                }
                else{
                    str = "";
                }
            }
        }
        System.out.println(str);
    }
}
