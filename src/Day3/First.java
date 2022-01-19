package Day3;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        String ar[][] = new String[order][order];

        for (int i = 0; i < order ; i++) {
            for (int j = 0; j < order ; j++) {
                ar[i][j] = ".";
            }
        }

    }
}
