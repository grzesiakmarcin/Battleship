package battleship;

public class Main {

    public static void main(String[] args) {
        char counterLetters =65;
        int counterNumbers=1;

        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 11; j++) {
                if(i==0&& j==0){
                    System.out.print(" ");
                }
            if(i==0&& j>=1) {
                System.out.print(counterNumbers+" ");
                counterNumbers++;
            }
                if(i>0 && j==0){
                    System.out.print(counterLetters+" ");
                    counterLetters++;
                }

                if(i>0&& j>0){
                   System.out.print("~ ");
               }
            }
            System.out.println();
        }

    }
}

class Guts{

    char[][] grid = new char[11][11];


    public void printGrid(char[][] array){}

}
