package Day1;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String Name = scn.nextLine();
        System.out.println(isNameValid(Name));

    }

    static boolean isNameValid(String name){
        int ar[] = {0,0,0,0,0};
        int checkST[] = {0,0};
        int locT = 0;
        int j=0;
        for (int i = 0; i < name.length() ; i++) {
            if(name.charAt(i)=='a' || name.charAt(i)=='A'){
                ar[0] += 1;
            }
            else if(name.charAt(i)=='e' || name.charAt(i)=='E'){
                ar[1] += 1;
            }
            else if(name.charAt(i)=='i' || name.charAt(i)=='I'){
                ar[2] += 1;
            }
            else if(name.charAt(i)=='o' || name.charAt(i)=='O'){
                ar[3] += 1;
            }
            else if(name.charAt(i)=='u' || name.charAt(i)=='U'){
                ar[4] += 1;
            }
            else if(name.charAt(i)=='s' || name.charAt(i)=='S'){
                checkST[j] = i;
                j++;
            }

            else if(name.charAt(i)=='t' || name.charAt(i)=='T'){
                locT = i;
            }

        }
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>1){
                return false;
            }
            else if(checkST[0] < locT  && locT < checkST[1]){
                return false;
            }
        }
        return true;
    }
}
