/* Qijia (Michael) Jin 
 canBalance coding bat problem
*/

public class canBalance {
	public static void main (String[] args) {
		int[] ia = {1, 1, 1, 2, 1};
		System.out.println(canBalance(ia));
		ia = new int [] {2, 1, 1, 2, 1};
		System.out.println(canBalance(ia));
		ia = new int [] {10, 10};
		System.out.println(canBalance(ia));
	}

	public static boolean canBalance (int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int l = 0, r = 0;	//left side sum vs right side sum
			for (int j = 0; j < nums.length; j++) {
				if (j <= i) {
					l = l + nums[j];
				}
				else {
					r = r + nums[j];
				}
			}
			if (l == r) {			//check if the "sides" are equal
				return true;
			}
		}
		return false;			//did not find equal "sides"
	}
}
