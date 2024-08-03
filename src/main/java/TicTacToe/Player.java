package TicTacToe;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public abstract class Player {
     String name;
     char mark;

    void makeMove(){}
    boolean isValidMove(int row , int  col){
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2)
        {
            if (ticTacToe.board[row][col] == ' ') {
                return true;
            }
        }
        return false;

    }

}
