/* Qijia (Michael) Jin
 tenRun coding bat problem
*/

public class tenRun {
	public static void main(String[] args) {
		int[] temp = {2, 10, 3, 4, 20, 5};
		System.out.println(toString(tenRun(temp)));
		temp = new int [] {10, 1, 20, 2};
		System.out.println(toString(tenRun(temp)));
		temp = new int [] {10, 1, 9, 20};
		System.out.println(toString(tenRun(temp)));
	}

	public static int [] tenRun (int[] nums) {
		int buffer = 0;
		if (nums.length > 0) {
			buffer = nums[0];
		}
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 10) == 0) {
				buffer = nums[i];
			}
			nums[i] = buffer;
		}
		return nums;
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
