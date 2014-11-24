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
	public boolean addWH(String s, int r, int c, int sym) {
		for (int i = 0; i < s.toCharArray().length; i++) {
			if (sym == (int)'H') {
				if ((c + s.toCharArray().length) < this.grid[0].length) {
					if (this.grid[r][c+i] != (char)0) {
						if (this.grid[r][c+i] == s.toCharArray()[i]) {
							System.out.println("letter matches!");
						}
					}
					else {
						this.grid[r][c + i] = s.toCharArray()[i];
					}
				}
				else {
					return false;
				}
			}
			else if (sym == -(int)'H') {
				if ((c - s.toCharArray().length) >= 0) {
					if (this.grid[r][c-i] != (char)0) {
						if (this.grid[r][c-i] == s.toCharArray()[i]) {
							System.out.println("letter matches!");
						}
						
						else {
							break;
						}
						
					}
					else {
						this.grid[r][c - i] = s.toCharArray()[i];
					}
				}
				else {
					return false;
				}
			}
			else if (sym == (int)'V') {
				if ((r + s.toCharArray().length) < this.grid.length) {
					if (this.grid[r+i][c] != (char)0) {
						if (this.grid[r+i][c] == s.toCharArray()[i]) {
							System.out.println("letter matches!");
						}
						
						else {		//string can't overlap with existing characters in grid
							break;
						}
					}
					else {
						this.grid[r + i][c] = s.toCharArray()[i];
					}
				}
				else {
					return false;
				}
			}
			else if (sym == -(int)'V') {
				if ((r - s.toCharArray().length) >= 0) {
					if (this.grid[r-i][c] != (char)0) {
						if (this.grid[r-i][c] == s.toCharArray()[i]) {
							System.out.println("letter matches!");
						}
						else {
							break;
						}
					}
					else {
						this.grid[r - i][c] = s.toCharArray()[i];
					}
				}
				else {
					return false;
				}
			}
			else if (sym == (int)'X') {
				if (((c + s.toCharArray().length) < this.grid[0].length) && ((r + s.toCharArray().length) < this.grid[0].length)) {
					if (this.grid[r+i][c+i] != (char)0) {
						if (this.grid[r+i][c+i] == s.toCharArray()[i]) {
							System.out.println("letter matches!");
						}
						else {
							break;
						}
					}
					else {
						this.grid[r+i][c + i] = s.toCharArray()[i];
					}
				}
				else {
					return false;
				}
			}
			else if (sym == -(int)'X') {
				if (((c - s.toCharArray().length) >= 0) && ((r + s.toCharArray().length) < this.grid[0].length)) {
					if (this.grid[r+i][c-i] != (char)0) {
					if (this.grid[r+i][c-i] == s.toCharArray()[i]) {
						System.out.println("letter matches!");
					}
						else {
							break;
						}
				}
				else {
					this.grid[r + i][c-i] = s.toCharArray()[i];
				}
				}
				else {
					return false;
				}
			}
			else if (sym == (int)'Y') {
				if (((c + s.toCharArray().length) < this.grid[0].length) && ((r - s.toCharArray().length) >= 0)) {
					if (this.grid[r-i][c+i] != (char)0) {
					if (this.grid[r-i][c + i] == s.toCharArray()[i]) {
						System.out.println("letter matches!");
					}
						else {
							break;
						}
				}
				else {
					this.grid[r - i][c + i] = s.toCharArray()[i];
				}
				}
				else {
					return false;
				}
			}
			else if (sym == -(int)'Y') {
				if (((r + s.toCharArray().length) >= 0) && ((r - s.toCharArray().length) >= 0)) {
					if (this.grid[r-i][c-i] != (char)0) {
					if (this.grid[r-i][c-i] == s.toCharArray()[i]) {
						System.out.println("letter matches!");
					}
						else {
							break;
						}
				}
				else {
					this.grid[r-i][c - i] = s.toCharArray()[i];
				}
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
}
