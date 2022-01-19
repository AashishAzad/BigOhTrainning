package Day3;

/*      Write a method Boolean isValidSudoku(int[][]Sudoku)
        Returns true if the given Sudoku is correctly arranged otherwise false

        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated
        according to the following rules:
        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.*/

public class First {
    public static void main(String[] args) {


        String ar[][] = {{"5","3",".",".","7",".",".",".","."}
                        ,{"6",".",".","1","9","5",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}};

        int []tocheck = {0,0,0,0,0,0,0,0,0};

        boolean result = checkHorizontal(ar, tocheck);
        if(result){
            result = checkVertical(ar,tocheck);
        }

        System.out.println(result);

    }

    public static boolean checkHorizontal(String[][]ar, int[]toCheck){

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (ar[i][j] != ".") {
                    int elem = Integer.parseInt(ar[i][j]);
                    if (elem>9){
                        return false;
                    }else{
                        toCheck[elem-1]++;
                    }
                }
            }
            for (int j = 0; j < 9; j++) {
                if(toCheck[j]>1){
                    return false;
                }
            }
            for (int j = 0; j < 9; j++) {
                toCheck[j] = 0;
            }
        }
        return true;
    }

    public static boolean checkVertical(String[][]ar, int[]toCheck){

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (ar[j][i] != ".") {
                    int elem = Integer.parseInt(ar[j][i]);
                    if (elem>9){
                        return false;
                    }else{
                        toCheck[elem-1]++;
                    }
                }
            }
            for (int j = 0; j < 9; j++) {
                if(toCheck[j]>1){
                    return false;
                }
            }
            for (int j = 0; j < 9; j++) {
                toCheck[j] = 0;
            }
        }
        return true;
    }
}
