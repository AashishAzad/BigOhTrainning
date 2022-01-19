package Day2;

import java.util.Scanner;

/* Write a function that takes in a non-empty array of distinct integers and an integer representing
   a target sum. The function should find all triplets in the array that sum up to the target sum and
   return a two-dimensional array of all these triplets. The numbers in each triplet should be ordered
    in ascending order, and the triplets themselves should be ordered in ascending order with respect
     to the numbers they hold. If no three numbers sum up to the target sum, the function should return an empty array
 */

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count=0;

        int[] sortedArray = sortedArray(ar);

        findTriplets(sortedArray,target);
    }

    public static int[] sortedArray(int[] ar){
        for (int i = 1; i < ar.length; i++) {
            int store = ar[i];
            int j = i-1;
            while(j>=0&&ar[j]>store){
                ar[j+1]=ar[j];
                j = j-1;
            }
            ar[j+1]=store;
        }
        return ar;
    }

    public static void findTriplets(int[] ar, int target){
        for (int i = 0; i < ar.length-2; i++) {
            for (int j = i+1; j < ar.length-1; j++) {
                for (int k = j+1; k < ar.length; k++) {
                    if(ar[i]+ar[j]+ar[k]==target){
                        System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
                    }
                }
            }
        }
    }
}
