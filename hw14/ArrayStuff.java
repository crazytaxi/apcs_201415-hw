/* Qijia (Michael) Jin

In class assignment - 100 random ints between 25 to 150 are loaded into the int array

HW 14 - added find() and max val value

*/

public class ArrayStuff {
public static int[] intarr;
	public static void main (String[] args) {
		intarr = new int[100];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = (int)(Math.ceil(Math.random() * 76.0d)) + 74;
		}
		int[] ia2 = new int[100];
		for (int i = 0; i < ia2.length; i++) {
			ia2[i] = (int)(Math.floor(Math.random() * 21.0d));
		}
		System.out.println(find(120));		//does 120 exist in the array
		System.out.println(maxVal(intarr));		//print max value in array
		System.out.println(freq(intarr, 2));
		System.out.println(mode(ia2));
		System.out.println(fastmode(ia2));
	}

	public static int find (int x) {
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int maxVal (int[] ia) {
		int mV = ia[0];
		for (int i = 1; i < ia.length; i++) {
			if (ia[i] > mV) {
				mV = ia[i];		//found new value 
			}
		}
		return mV;
	}

	public static int freq(int[] ia, int x) {
		int f = 0;
		for (int i = 0; i < ia.length; i++) {
			if (x == ia[i]) {
				++f;
			}
		}
		return f;
	}

	public static int mode(int[] ia) {
		int[] max = new int [2];	//first element is the number of times, second element is the actual number
		for (int i = 0; i < ia.length; i++) {
			if (freq(ia, ia[i]) > max[0]) {
				max[1] = ia[i];
				max[0] = freq(ia, ia[i]);
			}
		}
		return max[1];
	}

	public static int fastmode(int[] ia) {
		int maxVal = 20;	//from 0 to 25 inclusive
		int[] iter = new int[maxVal + 1];
		for (int i = 0; i < ia.length; i++) {
			++iter[ia[i]];
		}
		int[] max = {-1,-1};
		for (int i = 0; i < iter.length; i++){
			//System.out.println("n: " + i + " freq1: " + iter[i] + " freq2: " + freq(ia, i));
			//iter[i] and freq(ia,i) are equivalent
			if (iter[i] > max[0]) {
				max[1] = i;
				max[0] = iter[i];
			}
		}
		return max[1];
	}
}
