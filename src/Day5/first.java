package Day5;

/*Write a method void printArray(int[][]arr)
Prints array elements clock wise and anti-clockwise alternatively.
Input :
 1 2 3
 4 5 6
 7 8 9
Output :
1 2 3 6 9 8 7 4 5
3 2 1 4 7 8 9 6 5
*/

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowLength = sc.nextInt();
        int colLength = sc.nextInt();
        int[][] ar = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        printClockWise(ar);

        System.out.println();

        printAntiClockWise(ar);

    }

    public static void printClockWise(int[][] ar){
        int cR = 0;                     // represents Current Row
        int eR = ar.length;             // represents End Row
        int cC = 0;                     // represents Current Column
        int eC = ar[0].length;          // represents End Column

        while(cR < eR && cC < eC) {
            for (int i = cC; i < eC; i++) {
                System.out.print(ar[cR][i]+" ");
            }
            cR++;

            for (int i = cR; i < eR; i++) {
                System.out.print(ar[i][eC-1]+" ");
            }
            eC--;

            if (cR < eR){
                for (int i = eC-1; i >=cC  ; i--) {
                    System.out.print(ar[eR-1][i]+" ");
                }
                eR--;
            }

            if(cC < eC){
                for (int i = eR-1; i >=cR ; i--) {
                    System.out.print(ar[i][cC]+" ");
                }
                cC++;
            }
        }
    }

    public static void printAntiClockWise(int[][] ar){
        int cR = 0;                     // represents Current Row
        int eR = ar.length;             // represents End Row
        int eC = 0;                     // represents Current Column
        int cC = ar[0].length;          // represents End Column
        while(cR < eR && cC > eC){
            for (int i = cC-1; i >= 0; i--) {
                System.out.print(ar[cR][i]+" ");
            }
            cR++;

            for (int i = cR; i < eR; i++) {
                System.out.print(ar[i][eC]+" ");
            }
            eC++;

            if (cR < eR){
                for (int i = eC; i < cC  ; i++) {
                    System.out.print(ar[eR-1][i]+" ");
                }
                eR--;
            }

            if(cC > eC){
                for (int i = eR-1; i >=cR ; i--) {
                    System.out.print(ar[i][cC-1]+" ");
                }
                cC--;
            }
        }
    }

}
