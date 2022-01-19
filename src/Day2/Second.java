package Day2;

import java.util.Scanner;

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
