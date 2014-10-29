/* Qijia (Michael) Jin
 tripleUp coding bat problem
*/

public class tripleUp {
	public static void main(String[] args) {
		int[] temp = {1, 4, 5, 6, 2};
		System.out.println(tripleUp(temp));
		temp = new int [] {1, 2, 3};
		System.out.println(tripleUp(temp));
		temp = new int [] {1, 2, 4};
		System.out.println(tripleUp(temp));
	}

	public static boolean tripleUp (int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if ((i - 1) != -1 && (i + 1) != nums.length) {		//consider array bounds
				if (((nums[i - 1] + 1) == nums[i]) && ((nums[i + 1] - 1) == nums[i])) {
					return true;		//case found, break for loop and return true
				}
			}
		}
		return false;
	}
}
