/* Qijia (Michael) Jin
  maxMirror coding bat
*/

public class maxMirror {
	public static void main(String[] args) {
		System.out.println(maxMirror(new int[] {1,2,3,8,9,3,2,1}));
		System.out.println(maxMirror(new int[] {1,2,1,4}));
		System.out.println(maxMirror(new int[] {7,1,2,9,7,2,1}));
		System.out.println(maxMirror(new int[] {9, 1, 1, 4, 2, 1, 1, 1}));
	}

	public static int maxMirror (int[] nums) {
		int max = 0;
		int[] rn = new int[nums.length];
		for (int a = 0; a < rn.length; a++) {
			rn[a] = nums[(nums.length - 1) - a];
		}
		for (int i = 0; i < nums.length; i++) {
			//int current_sum = 0;
			for (int j = 0; j < nums.length; j++) {		//shift reversed array towards the end
				int current_sum = 0;
				while ((i + j) < nums.length) {
					if (rn[i + j] == nums[j]) {		//start or continue consecutive match pattern
						++current_sum;
					}
					else {				//consecutive reverse match pattern ended
						break;
					}
					++j;
				}
				if (current_sum > max) {
					max = current_sum;
				}
			}

			for (int j = 0; j < nums.length; j++) {		//shift reversed array towards the beginning
				int current_sum = 0;
				while ((j - i) < nums.length && (j - i) > -1) {
					if (rn[j - i] == nums[j]) {		//start or continue consecutive match pattern
						++current_sum;
					}
					else {				//consecutive reverse match pattern ended
						break;
					}
					++j;
					if (j >= nums.length) {
						break;
					}
				}
				if (current_sum > max) {
					max = current_sum;
				}
			}
		}
		return max;
	}
}
