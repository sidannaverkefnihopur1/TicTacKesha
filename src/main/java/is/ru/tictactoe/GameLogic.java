package is.ru.tictactoe;

public class GameLogic {

	final static char CIRCLE = 'O';
	final static char CROSS = 'X';

	public static boolean legalStatement(String s) {
		if (s.length() != 2) {
			System.out.println("Letter between a - c AND Number between 1 - 3");
			return false;
		}
		else if ((s.charAt(0) == 'a') || (s.charAt(0) == 'b') || (s.charAt(0) == 'c')) {
			if ( (s.charAt(1) == '1') || (s.charAt(1) == '2') || (s.charAt(1) == '3')) {
			 	return true;
			}
			else return false;
		}
		else return false;
	}
		public static int[] statementToInt(String s) {
		int[] statement = new int[2];
		statement[0] = (int)(s.charAt(0) - 'a');
		statement[1] = (int)(s.charAt(1) - '1');
		return statement;
	}

	public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
                boolean isGameOver = false;
                char turn = CROSS;
                String input;
                Board gameBoard = new Board();
                System.out.println("Welcome to TicTacToe version Hopur EITT");
                while (!isGameOver) {
                        gameBoard.printBoard();
                        input = br.readLine();
                        if (legalStatement(input)) {
                                int[] placeOnBoard = statementToInt(input);
                                if (gameBoard.isFieldEmpty(placeOnBoard)) {
                                        gameBoard.putOnField(placeOnBoard, turn);
                                        if (gameBoard.isWinner(turn)) {
                                                System.out.println("We have a winner..." + turn + " is the winner!");
                                                gameBoard.printBoard();
                                                isGameOver = true;
                                        }
                                        else if (gameBoard.isBoardFull()) {
                                                System.out.println("You have tie bitches...");
                                                isGameOver = true;
                                        }
                                        else {

                                                if(turn == CROSS) turn = CIRCLE;
                                                else turn = CROSS;
                                        }
                                }
                                else {
                                        System.out.println("This field is not empty!");
                                }
                        }
                        else  {
                                System.out.println("This input is bullsshit!");
                        }
                }
        }
}
		
}
