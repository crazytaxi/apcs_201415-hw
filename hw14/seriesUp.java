/* Qijia (Michael) Jin
 seriesUp coding bat problem
*/

public class seriesUp {
	public static void main(String[] args) {
		System.out.println(toString(seriesUp(3)));
		System.out.println(toString(seriesUp(4)));
		System.out.println(toString(seriesUp(2)));
	}

	public static int [] seriesUp (int max) {
		int al = (int)((((double)max * (double)max) + (double)max) * 0.5d);	//new array length
		int[] buffer = new int [al];
		al = 0;					//keep track of array index
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				buffer[al] = j;
				++al;
			}
		}
		return buffer;
	}

	public static String toString (int[] nums) {
		String cstr = "";
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				cstr += "{" + nums[0] + ",";
			}
			else if (i == (nums.length - 1)) {
				cstr +=  nums[i] + "}";
			}
			else {
				cstr += nums[i] + ",";
			}
		}
		return cstr;
	}
}
