package is.ru.tictactoe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class GameLogicTest {

	public static GameLogic gl = new GameLogic();
	
	@Test
	public void testLegalStatement() {
		
		assertTrue("A af vera loglegt", gl.legalStatement("a1"));
	}
	@Test
	public void testLegalStatement(){

		assertFalse("A ad vera ologlegt", gl.legalStatement("d4"));
	}
}
