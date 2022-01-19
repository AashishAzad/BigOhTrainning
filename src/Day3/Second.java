package Day3;

/*  Write a method Boolean isKingSafe(int[][]chessBoard)
    Returns true if king in the given chess board is safe from
    the given enemies otherwise false;
    NOTE: Enemies are- Horse, Camel, Queen, Elephant only
    Do not consider the colour case of the chess board for traversal of camel and all.*/


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        int cb[][] = new int[order][order];
        int rowLocOfKing = sc.nextInt();
        int colLocOfKing = sc.nextInt();

        int rowLocOfQueen = sc.nextInt();
        int colLocOfQueen = sc.nextInt();

        int rowLocOfElephant = sc.nextInt();
        int colLocOfElephant = sc.nextInt();

        int rowLocOfCamel = sc.nextInt();
        int colLocOfCamel = sc.nextInt();

        int rowLocOfHorse = sc.nextInt();
        int colLocOfHorse = sc.nextInt();



        boolean result = checkByQueen(order,rowLocOfKing,colLocOfKing,rowLocOfQueen,colLocOfQueen);

        if(result){

            if(checkByElephant(order,rowLocOfKing,colLocOfKing,rowLocOfElephant,colLocOfElephant)){

                if (checkByCamel(order,rowLocOfKing,colLocOfKing,rowLocOfCamel,colLocOfCamel)){

                    if (checkByHorse(order,rowLocOfKing,colLocOfKing,rowLocOfHorse,colLocOfHorse)){

                        result = true;
                    }
                    else{
                        result = false;
                    }
                }
                else{
                    result = false;
                }
            }else{
                result = false;
            }


        }
        else{
            result = false;
        }

        System.out.println(result);

    }

    public static boolean checkByElephant(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfElephant, int colLocOfElephant){

        if(checkVertically(order,colLocOfKing,colLocOfElephant)){
            if (checkHorizontally(order,rowLocOfKing,rowLocOfElephant)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static boolean checkByQueen(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfQueen, int colLocOfQueen){

        if(checkVertically(order,colLocOfKing,colLocOfQueen)){
            if(checkHorizontally(order,rowLocOfKing,rowLocOfQueen)){
                if (checkLeftDiagonal(order,rowLocOfKing,colLocOfKing,rowLocOfQueen,colLocOfQueen)){
                    if(checkRightDiagonal(order,rowLocOfKing,colLocOfKing,rowLocOfQueen,colLocOfQueen)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                return false;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }



    }

    public static boolean checkByCamel(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfCamel, int colLocOfCamel){
        if (checkLeftDiagonal(order,rowLocOfKing,colLocOfKing,rowLocOfCamel,colLocOfCamel)){
            if (checkRightDiagonal(order,rowLocOfKing,colLocOfKing,rowLocOfCamel,colLocOfCamel)){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }

    }

    public static boolean checkByHorse(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfHorse, int colLocOfHorse){
        if (rowLocOfHorse -1 == rowLocOfKing && colLocOfHorse - 2 == colLocOfKing){
            return false;
        }
        else if (rowLocOfHorse - 1 == rowLocOfKing && colLocOfHorse + 2 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse - 2 == rowLocOfKing && colLocOfHorse - 1 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse - 2 == rowLocOfKing && colLocOfHorse + 1 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse + 1 == rowLocOfKing && colLocOfHorse - 2 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse + 1 == rowLocOfKing && colLocOfHorse + 2 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse + 2 == rowLocOfKing && colLocOfHorse - 1 == colLocOfKing) {
            return false;
        }
        else if (rowLocOfHorse + 2 == rowLocOfKing && colLocOfHorse + 1 == colLocOfKing) {
            return false;
        }
        else{
            return true;
        }

    }

    public static boolean checkVertically(int order, int colLocOfKing, int colLocOfEnemy){
        if(colLocOfEnemy==colLocOfKing){
            return false;
        }else {
            return true;
        }
    }

    public static boolean checkHorizontally(int order, int rowLocOfKing, int rowLocOfEnemy){
        if (rowLocOfEnemy==rowLocOfKing){
            return false;
        }else{
            return true;
        }
    }

    public static boolean checkLeftDiagonal(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfEnemy, int colLocOfEnemy){

        while (rowLocOfEnemy>=0 || colLocOfEnemy>=0){
            if(rowLocOfEnemy==rowLocOfKing&&colLocOfEnemy==colLocOfKing){
                return false;
            }
            else{
                rowLocOfEnemy--;
                colLocOfEnemy--;
            }
        }

        while(rowLocOfEnemy<order || colLocOfEnemy<order){
            if(rowLocOfEnemy==rowLocOfKing&&colLocOfEnemy==colLocOfKing){
                return false;
            }
            else{
                rowLocOfEnemy++;
                colLocOfEnemy++;
            }
        }
        return true;
    }

    public static boolean checkRightDiagonal(int order, int rowLocOfKing, int colLocOfKing, int rowLocOfEnemy, int colLocOfEnemy){

        while (rowLocOfEnemy>=0 || colLocOfEnemy<order){
            if(rowLocOfEnemy==rowLocOfKing&&colLocOfEnemy==colLocOfKing){
                return false;
            }
            else{
                rowLocOfEnemy--;
                colLocOfEnemy++;
            }
        }

        while(rowLocOfEnemy<order || colLocOfEnemy>=0){
            if(rowLocOfEnemy==rowLocOfKing&&colLocOfEnemy==colLocOfKing){
                return false;
            }
            else{
                rowLocOfEnemy++;
                colLocOfEnemy--;
            }
        }
        return true;
    }

}
