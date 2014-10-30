/* Qijia (Michael) Jin
  maxMirror coding bat
*/

public class maxMirror {
	public static void main(String[] args) {
		System.out.println(maxMirror(new int[] {1,2,3,8,9,3,2,1}));
		System.out.println(maxMirror(new int[] {1,2,1,4}));
		System.out.println(maxMirror(new int[] {7,1,2,9,7,2,1}));
	}

	public static int maxMirror (int[] nums) {
		int max = 0;
		int[] rn = new int[nums.length];
		for (int a = 0; a < rn.length; a++) {
			rn[a] = nums[(nums.length - 1) - a];
		}
		for (int i = 0; i < nums.length; i++) {
			//int current_sum = 0;
			for (int j = 0; j < nums.length; j++) {
				int current_sum = 0;
				//if (i + j < nums.length) {
				while (rn[i + j] == nums[j])
					if (rn[i] == nums[j]) {
						++current_sum;
					}
				//}
			}
			if (current_sum > max) {
				max = current_sum;
			}
		}
		return max;
	}
}
