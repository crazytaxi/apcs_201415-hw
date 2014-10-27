/* Qijia (Michael) Jin

In class assignment - 100 random ints between 25 to 150 are loaded into the int array

*/

public class ArrayStuff {
	public static void main (String[] args) {
		int[] intarr = new int[100];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = (int)(Math.floor(Math.random() * 125.0d)) + 25;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(intarr[(i * 10) + j] + " ");
			}
			System.out.println();
		}
	}
}
