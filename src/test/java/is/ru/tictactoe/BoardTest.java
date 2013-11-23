package is.ru.tictactoe;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {
      public static Board br = new Board();
      public char[][] testArr = new char[3][3];

      @Test
      public void testcreateEmptyBoard() {
	  Board b = new Board();
	  testArr = b.getBoard();
          for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
		
              	assertTrue("Board tile["+i+"]["+j+"] a ad vera jafnt og BLANK", (testArr[i][j] == b.BLANK));
            }
          }
      }

      @Test
      public void testisFieldEmptyTrue() {
            testArr[0][0] = br.BLANK;
            Board b = new Board(testArr);
            int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;

            assertTrue("testsFieldEmptyTrue atti ad vera true", b.isFieldEmpty(statement));
      }

      @Test
      public void testisFieldEmptyFalse() {
            testArr[0][0] = br.CIRCLE; // grid number a1
            Board b = new Board(testArr);
            int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;

            assertFalse("testsFieldEmptyFalse atti ad vera false", b.isFieldEmpty(statement));
      }

      @Test
      public void testputOnFieldOccupied() {
	    testArr[0][0] = br.CIRCLE;
	    Board b = new Board(testArr);
	    int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;
     	    b.putOnField(statement, 'X');
	    testArr = b.getBoard();
	    assertFalse( "testputOnField atti ad vera occupied " , testArr[0][0]  == 'X'); 
      }     

      @Test
      public void testputOnFieldNotOccupied() {
      	    Board b = new Board();
            int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;
	    b.putOnField(statement, 'X');
	    testArr = b.getBoard();
            assertTrue( "testputOnField atti ekki ad vera occupied " , testArr[0][0] ==  'X');

      }

      @Test
      public void isBoardFullTest1() {
          for (int i = 0; i < 3; i++) {
              for(int j = 0; j < 3; j++) {
                      testArr[i][j] = 'X';
              }
          }
          Board b = new Board(testArr);
          assertTrue("If board is full(True)", b.isBoardFull());
      }

      @Test
      public void isBoardFullTest2() {
          for (int i = 0; i < 3; i++) {
              for(int j = 0; j < 3; j++) {
                      testArr[i][j] = '-';
              }
          }
          Board b = new Board(testArr);
          assertFalse("If board is not full(False)", b.isBoardFull());
      }


      @Test
      public void testisWinnerNotDoneThreeTimesCircle() {
            testArr[0][0] = br.CIRCLE;
            testArr[1][0] = br.CIRCLE;
            Board b = new Board(testArr);

            assertFalse("testisWinnerNotDoneThreeTimesCircle atti ad vera false", b.isWinner('O'));
      }

      @Test
      public void testisWinnerNotDoneThreeTimesCross() {
            testArr[0][0] = br.CROSS;
            testArr[1][0] = br.CROSS;
	    Board b = new Board(testArr);

            assertFalse("testisWinnerNotDoneThreeTimesCross atti ad vera false", b.isWinner('X'));
      }

      @Test
      public void testisWinnerTrueCircle1() {
            testArr[0][0] = br.CIRCLE;
            testArr[1][0] = br.CIRCLE;
            testArr[2][0] = br.CIRCLE;
            Board b = new Board(testArr);


            assertTrue("testisWinnerTrueCircle1 atti ad vera true", b.isWinner('O'));
      }
      @Test
      public void testisWinnerTrueCircle2() {
            testArr[0][0] = br.CIRCLE;
            testArr[1][1] = br.CIRCLE;
            testArr[2][2] = br.CIRCLE;
            Board b = new Board(testArr);
            assertTrue("testisWinnerTrueCircle2 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle3() {
            testArr[0][0] = br.CIRCLE;
            testArr[0][1] = br.CIRCLE;
            testArr[0][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle3 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle4() {
            testArr[0][2] = br.CIRCLE;
            testArr[1][1] = br.CIRCLE;
            testArr[2][0] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle4 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle5() {
            testArr[1][0] = br.CIRCLE;
            testArr[1][1] = br.CIRCLE;
            testArr[1][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle5 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle6() {
            testArr[0][1] = br.CIRCLE;
            testArr[1][1] = br.CIRCLE;
            testArr[2][1] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle6 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle7() {
	    testArr[2][0] = br.CIRCLE;
            testArr[2][1] = br.CIRCLE;
            testArr[2][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle7 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCircle8() {
            testArr[0][2] = br.CIRCLE;
            testArr[1][2] = br.CIRCLE;
            testArr[2][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCircle8 atti ad vera true", b.isWinner('O'));
      }

      @Test
      public void testisWinnerTrueCross() {
            testArr[0][0] = br.CIRCLE;
            testArr[1][0] = br.CIRCLE;
            testArr[2][0] = br.CIRCLE;
            Board b = new Board(testArr);

            assertTrue("testisWinnerTrueCross atti ad vera true", b.isWinner('O'));
      }


      @Test
      public void testisWinnerFalseCircle1() {
            testArr[0][0] = br.CIRCLE;
            testArr[1][0] = br.CIRCLE;
            testArr[2][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertFalse("testisWinnerFalseCircle1 atti ad vera false", b.isWinner('O'));
      }

      @Test
      public void testisWinnerFalseCircle2() {
            testArr[0][0] = br.CROSS;
            testArr[1][1] = br.CROSS;
            testArr[2][0] = br.CROSS;
            Board b = new Board(testArr);

            assertFalse("testisWinnerFalseCircle2 atti ad vera false", b.isWinner('X'));
      }

      @Test
      public void testisWinnerFalseCircle3() {
            testArr[0][1] = br.CIRCLE;
            testArr[1][0] = br.CIRCLE;
            testArr[2][0] = br.CIRCLE;
	    testArr[2][1] = br.CIRCLE;
            testArr[1][2] = br.CIRCLE;
            Board b = new Board(testArr);

            assertFalse("testisWinnerFalseCircle3 atti ad vera false", b.isWinner('O'));
      }

      @Test
      public void testisWinnerFalseCross1() {
            testArr[0][0] = br.CROSS;
            testArr[1][0] = br.CROSS;
            testArr[2][2] = br.CROSS;
            Board b = new Board(testArr);

            assertFalse("testisWinnerFalseCross1 atti ad vera false", b.isWinner('X'));
      }
}
