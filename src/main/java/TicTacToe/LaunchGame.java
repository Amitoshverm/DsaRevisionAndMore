package TicTacToe;

public class LaunchGame {
    public static void main(String[] args) {
        ticTacToe t = new ticTacToe();

        Human p1 = new Human("alex", 'X');
        Ai computer = new Ai("weakAi", 'O');

        Player currentPlayer;
        currentPlayer = p1;

        while (true)
        {
            System.out.println(currentPlayer.getName()+ " turn");
            currentPlayer.makeMove();
            ticTacToe.displayBoard();
            if (ticTacToe.checkColWin() || ticTacToe.checkDiagonalWin() || ticTacToe.checkRowWin())
            {
                System.out.println(currentPlayer.getName()+ " has won");
                break;
            }
            else if (t.isTie()) {
                System.out.println("Game is tied");
                break;
            }
            else
            {
                if (currentPlayer == p1)
                {
                    currentPlayer = computer;
                }
                else
                {
                    currentPlayer = p1;
                }
            }
        }
    }
}
