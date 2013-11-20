package is.ru.tictactoe;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class gameLogicTest {
	@Test
	public void testLegalStatement() {
		gameLogic gl = new gameLogic();
		assertTrue("A af vera loglegt", gl.legalStatement("a1"));
	}
}
