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
		
}