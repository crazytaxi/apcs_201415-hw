/* Qijia (Michael) Jin
 sum67 coding bat problem
*/

public class sum67 {
	public static void main(String[] args) {
		int[] temp = {1,2,2};
		System.out.println(sum67(temp));
		int[] temp1 = {1,2,2,6,99,99,7};
		System.out.println(sum67(temp1));
		int[] temp2 = {1,1,6,7,2};
		System.out.println(sum67(temp2));
	}

	public static int sum67 (int[] nums) {
		int total = 0;
		boolean adding = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				adding = false;
			}
			else if (nums[i] == 7) {
				adding = true;
			}
			else if (adding) {
				total = total + nums[i];
			}
		}
		return total;
	}
}
