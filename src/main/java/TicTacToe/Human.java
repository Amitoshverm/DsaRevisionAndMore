package TicTacToe;

import java.util.Scanner;


public class Human extends Player{


    public Human(String name, char mark) {
        this.name = name;
        this.mark = mark;

    }

    void makeMove() {
        Scanner in = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("enter the row and the col");
            row = in.nextInt();
            col = in.nextInt();
        } while(!isValidMove(row, col));

        ticTacToe.placeMark(row, col, mark);

    }

}
