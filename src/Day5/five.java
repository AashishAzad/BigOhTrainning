package Day5;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        int ar[][] = new int[order][order];
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int row = order;
        int col = order;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i!=j){
                    int temp = ar[i][j];
                    ar[i][j] = ar[j][i];
                    ar[j][i] = temp;
                }
            }

        }

        for (int i = 0; i < order/2; i++) {
            for (int j = order-1; j > order/2; j--) {
                int temp = ar[i][i];
                ar[i][i] = ar[i][j];
                ar[i][j] = temp;
            }
        }

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
