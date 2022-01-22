package Day5;

import java.util.Scanner;

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
*/

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] ar = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        System.out.println(ifElementPresent(ar, target));
    }

    public static boolean ifElementPresent(int[][] ar, int target){

        for (int i = 0; i < ar.length; i++) {
            if(target<=ar[i][ar[0].length-1]){
                for (int j = 0; j < ar[i].length; j++) {
                    if (ar[i][j]==target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
