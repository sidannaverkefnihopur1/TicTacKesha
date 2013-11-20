package is.ru.tictactoe;

public class gameLogic {
	public static boolean legalStatement(String s) {
		if (s.length() != 2) {
			System.out.println("Letter between a - c AND Number between 1 - 3");
			return false;
		}
		else return true;
	}
}