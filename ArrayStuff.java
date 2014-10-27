/* Qijia (Michael) Jin

In class assignment - 100 random ints between 25 to 150 are loaded into the int array

*/

public class ArrayStuff {
	public static void main (String[] args) {
		int[] intarr = new int[100];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = (int)(Math.ceil(Math.random() * 126.0d)) + 24;
		}
	}
}
