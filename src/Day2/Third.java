package Day2;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==i){
                    System.out.print("\\");
                }
                else if (j==n+1-i){
                    System.out.print("/");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            if(j==(n/2)+1){
                System.out.print("/");
            }
            else{
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = (n/2)+2; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==i){
                    System.out.print("\\");
                }
                else if (j==n+1-i){
                    System.out.print("/");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
