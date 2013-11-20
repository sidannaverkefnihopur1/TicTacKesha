package is.ru.tictactoe;

public class GameLogic {
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
}