package battleship;

public class Main {

    public static void main(String[] args) {
        char[][] board = new char[11][11];
        Bebechy startTheShow = new Bebechy();
        startTheShow.fullFillBoard(board);
        startTheShow.printBoard(board);
    }
}
class Bebechy{

    public char[][] fullFillBoard(char[][] boardToFullFill) {
        int counter = 0;
//drawing the grid
        for (int i = 0; i < boardToFullFill.length; i++) {
            for (int j = 0; j < boardToFullFill[0].length; j++) {
                if (i == 0) {
                    boardToFullFill[0][j] = '-';
                }
                if (i == (boardToFullFill.length - 1)) {
                    boardToFullFill[boardToFullFill.length - 1][j] = '-';
                }
                if (i != 0 && i != boardToFullFill.length - 1 && j == 0 || i != 0 && i != boardToFullFill.length - 1 && j == boardToFullFill[0].length - 1) {
                    boardToFullFill[i][j] = '|';
                }

            }

        }

//fullfill board with moves
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j < 8; j++) {
//                if ((j % 2) != 0) {
//                    boardToFullFill[i][j] = ' ';
//                } else {
//                    boardToFullFill[i][j] = arrayOfImput[counter];
//                    counter++;
//                }
//            }
//        }
//
//
        return boardToFullFill;

    }


    public void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}