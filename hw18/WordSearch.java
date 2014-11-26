/*	Qijia (Michael) Jin
	Classic Word Search Puzzle
	rows and columns should start from 1 (not zero)....
*/
import java.math.*;

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

	public void fillEmpty () {
		String buffer = new String ("abcdefghijklmnopqrstuvwxyz");
		for (int i = 0; i < this.grid.length; i++) {
			for (int j = 0; j < this.grid[0].length; j++) {
				if (this.grid[i][j] == (char)0) {
					this.grid[i][j] = buffer.toCharArray()[(int)(Math.floor(Math.random() * 26))];
				}
			}
		}
	}

	public boolean addR (String s) {
		for (int i = 0; i < 10; i++) {
			int orient = 0;
			int gen = ((int)Math.floor(Math.random() * 8));
			if (gen == 0) {
				orient = (int)'H';
			}
			else if (gen == 1) {
				orient = -(int)'H';
			}
			else if (gen == 2) {
				orient = (int)'V';
			}
			else if (gen == 3) {
				orient = -(int)'V';
			}
			else if (gen == 4) {
				orient = (int)'X';
			}
			else if (gen == 5) {
				orient = -(int)'X';
			}
			else if (gen == 6) {
				orient = (int)'Y';
			}
			else if (gen == 7) {
				orient = -(int)'Y';
			}
			if (this.addWH(s, ((int)Math.floor(Math.random() * this.grid.length)), ((int)Math.floor(Math.random() * this.grid[0].length)), orient)) {
				return true;
			}
		}
		return false;
	}

	public boolean addWH(String s, int r, int c, int sym) {
		for (int i = 0; i < s.toCharArray().length; i++) {
			if (sym == (int)'H') {
				if ((c + (s.toCharArray().length - 1)) < this.grid[0].length) {
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
				if ((c - (s.toCharArray().length - 1)) >= 0) {
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
				if ((r + (s.toCharArray().length - 1)) < this.grid.length) {
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
				if ((r - (s.toCharArray().length - 1)) >= 0) {
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
				if (((c + (s.toCharArray().length - 1)) < this.grid[0].length) && ((r + (s.toCharArray().length - 1)) < this.grid.length)) {
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
				if (((c - (s.toCharArray().length - 1)) >= 0) && ((r + (s.toCharArray().length - 1)) < this.grid.length)) {
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
				if (((c + (s.toCharArray().length - 1)) < this.grid[0].length) && ((r - (s.toCharArray().length - 1)) >= 0)) {
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
				if (((c - (s.toCharArray().length - 1)) >= 0) && ((r - (s.toCharArray().length - 1)) >= 0)) {
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
