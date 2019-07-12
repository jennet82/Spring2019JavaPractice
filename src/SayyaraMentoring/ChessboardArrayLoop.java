package SayyaraMentoring;

public class ChessboardArrayLoop {

	public static void main(String[] args) {
		
		/*
		 * Given a 8x8 two-dimensional array of strings named chessboard. Initialize
		 * values inside an array accordingly to the chess board. So first element in
		 * the array, chessboard[0][0] should have a value "1a", and last element in the
		 * array, chessboard[7][7] should have a value "8h".
		 */
		String[][] chessBoard = new String[8][8];
		for (int i = 1; i < 9; i++) {
			System.out.println("I am outer loop and my value is" + i);
			int j = 0;
			for (char x = 'a', j1 = 0; x <= 'h'; x++, j++) {
				
				System.out.println("outer"+i+" inner  is" + x);
				
				chessBoard[i - 1][j] = "" + i + x;
				//System.out.print("" + i + x);

			}
			System.out.println();

		}

	}

}
