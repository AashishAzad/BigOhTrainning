package Test;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();           // Size of first Array
        int nums1[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();       // Size of second Array
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int mergedArray[] = new int[m+n];
        int i = 0;                  // Current Index for array nums1
        int j = 0;                  // Current Index for array nums2
        int mAI = 0;                // Current Index for array mergedArray
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                mergedArray[mAI] = nums1[i];
                i++;
                mAI++;
            }
            else{
                mergedArray[mAI] = nums2[j];
                j++;
                mAI++;
            }
        }

        while(i<m){
            mergedArray[mAI] = nums1[i];
            mAI++;
            i++;
        }

        while(j<n){
            mergedArray[mAI] = nums2[j];
            mAI++;
            j++;
        }

        /*for (int k = 0; k < mergedArray.length; k++) {
            System.out.print(mergedArray[k]+" ");
        }*/

        System.out.println();

        int median = mAI/2;
        System.out.println("Middle element: "+mergedArray[median]);
    }
}
