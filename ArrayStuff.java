/* Qijia (Michael) Jin

In class assignment - 100 random ints between 25 to 150 are loaded into the int array

HW 14 - added find() and max val value

*/

public class ArrayStuff {
public static int[] intarr;
	public static void main (String[] args) {
		intarr = new int[100];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = (int)(Math.ceil(Math.random() * 126.0d)) + 24;
		}
	}

	public int find (int x) {
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public int maxVal () {
		int mV = intarr[0];
		for (int i = 1; i < intarr.length; i++) {
			if (intarr[i] > mV) {
				mV = intarr[i];		//found new value 
			}
		}
		return mV;
	}
}
