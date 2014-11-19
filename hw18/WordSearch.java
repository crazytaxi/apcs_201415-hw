/*	Qijia (Michael) Jin
	Classic Word Search Puzzle
	rows and columns should start from 1 (not zero)....
*/

public class WordSearch {
	private char[][] grid;

	public WordSearch (int row, int col) {
		this.grid = new char[row][col];
	}
	public WordSearch () {
		this.grid = new char[2][2];
	}
	public String toString () {
		String buffer = new String ("");
		for (int i = 0; i < this.grid.length; i++) {
			for (int j = 0; j < this.grid[0].length; j++) {
				if (this.grid[i][j] == (char)0) {
					buffer = buffer + '\u001B' + "[106m "+ '\u001B' + "[49m";
				}
				else {
					buffer = buffer + this.grid[i][j];
				}
			}
			buffer = buffer + "\n";
		}
		return buffer;
	}
	public void addWH(String s, int r, int c) {
		for (int i = 0; i < s.toCharArray().length; i++) {
			this.grid[r][c + i] = s.toCharArray()[i];
		}
	}
}
