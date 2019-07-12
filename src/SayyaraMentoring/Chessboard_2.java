package SayyaraMentoring;

public class Chessboard_2 {

	public static void main(String[] args) {
		
		String[][] chessBoard = new String[8][8];
		for (int i = 1; i < 9; i++) {
			int j = 0;
			for (char x = 'a', j1 = 0; x <= 'h'; x++, j++) {
				chessBoard[i - 1][j] = "" + i + x;
				System.out.print(" " + i + x);

			}
			System.out.println();

		}
		System.out.println(java.util.Arrays.deepToString(chessBoard));








	}

}
