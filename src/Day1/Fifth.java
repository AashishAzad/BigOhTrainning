package Day1;

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        while(num%5!=0 || num%7!=0 || num%8!=0 || num%9!=0){
            num++;
        }
        System.out.println(num);
    }
}
