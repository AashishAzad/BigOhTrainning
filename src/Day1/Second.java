package Day1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int lastDigit = N % 10;

        int firstDigit = 0;
        int count = 0;
        int swappedNumber;
        int num = N;
        while(num!=0){
            firstDigit = num%10;
            num /= 10;
            count++;
        }



        swappedNumber = lastDigit;
        swappedNumber *= (int) Math.round(Math.pow(10,count-1));
        swappedNumber += N % ((int)Math.round(Math.pow(10,count-1)));
        swappedNumber -= lastDigit;
        swappedNumber += firstDigit;


        System.out.println(swappedNumber);




    }
}
