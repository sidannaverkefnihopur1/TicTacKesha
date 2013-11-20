package is.ru.tictactoe;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class BoardTest {
      public static Board br = new Board();
      public char[][] testArr = new char[3][3];

      @Test
      public void testcreateEmptyBoard() {

          for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
              
              assertTrue("Board tile["+i+"]["+j+"] a ad vera jafnt og BLANK", testArr[i][j] == BLANK;);
            }
          }
      }s

      @Test
      public void testisFieldEmptyTrue() {
            testArr[0][0] = br.BLANK;
            Board b = new Board(testArr);
            int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;

            assertTrue("testsFieldEmptyTrue atti ad vera true", br.isFieldEmpty(statement));
      }

      @Test
      public void testisFieldEmptyFalse() {
            testArr[0][0] = br.CIRCLE; // grid number a1
            Board b = new Board(testArr);
            int[] statement = new int[2];
            statement[0] = 0;
            statement[1] = 0;

            assertFalse("testsFieldEmptyFalse atti ad vera false", br.isFieldEmpty(statement));
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

}

