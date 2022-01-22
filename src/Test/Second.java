package Test;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();       //Size of Sliding Window



        for (int i = 0; i < ar.length-k+1; i++) {
            int max = ar[i];
            for (int j = i+1; j <= i+k-1; j++) {
                if(ar[j]>max){
                    max = ar[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
