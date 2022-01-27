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

        for (int i = 0; i < row-1; i++) {
            for (int j = i+1; j < col; j++) {
                if(i!=j){
                    int temp = ar[i][j];
                    ar[i][j] = ar[j][i];
                    ar[j][i] = temp;
                }
            }

        }

        for (int i = 0; i < order; i++) {
            int j = (order/2)-1;
            int k;
            if (order%2==0){
                k = order/2;
            }
            else{
                k = (order/2)+1;
            }
            while(j>=0&&k<order){
                int temp = ar[i][j];
                ar[i][j] = ar[i][k];
                ar[i][k] = temp;
                j--;
                k++;
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
