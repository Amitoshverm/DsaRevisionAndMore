package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class Ai extends Player{

    public Ai(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner in = new Scanner(System.in);
        int row;
        int col;

        do {
            Random r = new Random();
            row = r.nextInt(3);
            col = r.nextInt(3);
        } while(!isValidMove(row, col));

        ticTacToe.placeMark(row, col, mark);


    }

}
