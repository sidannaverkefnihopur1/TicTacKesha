package is.ru.tictactoe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameLogicTest {

	public static GameLogic gl = new GameLogic();
	
	@Test
	public void testLegalStatement1() {
		
		assertTrue("A af vera loglegt", gl.legalStatement("a1"));
	}
	@Test
	public void testLegalStatement2(){

		assertFalse("A ad vera ologlegt", gl.legalStatement("d4"));
	}
	@Test
	public void testStatementToInt() {
		int[] rowANDcol = gl.statementToInt("b2");

		assertEquals("Fyrsti char atti ad vera 1", rowANDcol[0], 1);

		assertEquals("Annar char atti ad vera 1", rowANDcol[1], 1);

	}
}
