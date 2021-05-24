package battleship;

public class Main {

    public static void main(String[] args) {
        Guts playMe = new Guts();
        playMe.startingTheBoard(playMe.board);

        playMe.printBoard(playMe.board);



//
//        char counterLetters =65;
//        int counterNumbers=1;
//
//        for (int i = 0; i < 11; i++) {
//
//            for (int j = 0; j < 11; j++) {
//                if(i==0&& j==0){
//                    System.out.print(" ");
//                }
//            if(i==0&& j>=1) {
//                System.out.print(counterNumbers+" ");
//                counterNumbers++;
//            }
//                if(i>0 && j==0){
//                    System.out.print(counterLetters+" ");
//                    counterLetters++;
//                }
//
//                if(i>0&& j>0){
//                   System.out.print("~ ");
//               }
//            }
//            System.out.println();
//        }

    }
}


class Guts{

    public void markYourPlace(){
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
    }




    String[][] board = new String[11][11];

    public String[][] startingTheBoard(String[][] board){


        char counterLetters =65;
        int counterNumbers=1;



        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 11; j++) {
                if(i==0&& j==0){
                    board [0][0]=" ";
                }
                if(i==0&& j>=1) {
                    board [i][j]=String.valueOf(counterNumbers+" ");
                    counterNumbers++;
                }
                if(i>0 && j==0){
                    board [i][j]=String.valueOf(counterLetters+" ");
                    counterLetters++;
                }

                if(i>0&& j>0){
                    board[i][j]="~ ";
                }
            }

        }

       return board;
    }

    public void printBoard (String[][] board){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

}
