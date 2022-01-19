package Day2;

import java.util.Scanner;

/* Write a program to remove duplicate values from an array
   and returns an array of unique values.
   int[] removeDuplicates(int[]values)
 */

public class First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int givenArraySize = sc.nextInt();
        int []givenArray = new int[givenArraySize];
        for (int i = 0; i < givenArraySize ; i++) {
            givenArray[i] = sc.nextInt();
        }
        int[] sortedArray = sortedArray(givenArray);
        removeDuplicate(sortedArray);
    }

    public static int[] sortedArray(int ar[]){
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

    public static void removeDuplicate(int ar[]){
        int temp[] = new int[ar.length];
        int j = 0;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]!=ar[i+1]){
                temp[j++]=ar[i];
            }
        }
        temp[j++] = ar[ar.length-1];
        System.out.println(temp.length);
        for (int i = 0; i < j; i++) {
            ar[i] = temp[i];
        }

        for (int i = 0; i < j; i++) {
            System.out.println(ar[i]);
        }

    }
}
