package is.ru.tictactoe;

public class Board {

        private static char[][] grid = new char[3][3];

        final static char BLANK = '-';
        final static char CROSS = 'X';
        final static char CIRCLE = 'O';


	public Board() {
                createEmptyBoard();
        }
        // this is for our tests...
        public Board(char[][] b) {
                grid = b;
        }

        public static char[][] getBoard() {
                return grid;
        }

        private void createEmptyBoard() {
                for (int i = 0; i < 3; i++) {
                        for(int j = 0; j < 3; j++) {
                                grid[i][j] = BLANK;
                        }
                }
        }

	public boolean isBoardFull() {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (grid[i][j] == BLANK) return false;
                        }
                }
                return true;
        }

	
	public boolean isFieldEmpty(int[] theField) {
                if (grid[theField[0]][theField[1]] == BLANK) return true;
                else return false;
        }

        public boolean isWinner(char player) {
                if ((grid[0][0] == player) && (grid[0][1] == player) && (grid[0][2] == player)) { return true; } // a1, a2, a3
        	if ((grid[1][0] == player) && (grid[1][1] == player) && (grid[1][2] == player)) { return true; } // b1, b2, b3
	        if ((grid[2][0] == player) && (grid[2][1] == player) && (grid[2][2] == player)) { return true; } // c1, c2, c3
	        if ((grid[0][0] == player) && (grid[1][0] == player) && (grid[2][0] == player)) { return true; } // a1, b1, c1
	        if ((grid[0][1] == player) && (grid[1][1] == player) && (grid[2][1] == player)) { return true; } // a2, b2, c2
	        if ((grid[0][2] == player) && (grid[1][2] == player) && (grid[2][2] == player)) { return true; } // a3, b3, c3
        	if ((grid[0][0] == player) && (grid[1][1] == player) && (grid[2][2] == player)) { return true; } // a1, b2, c3
	        if ((grid[2][0] == player) && (grid[1][1] == player) && (grid[0][2] == player)) { return true; } // c1, b2, a3
        	return false;
        }

        public static void printBoard() {
                System.out.println("   \t1\t2\t3");
                for (int i = 0; i < 3; i++) {
                        System.out.print( (char)('a' + i) + "\t");
                        for (int j = 0; j < 3; j++) {
                                System.out.print(grid[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}

