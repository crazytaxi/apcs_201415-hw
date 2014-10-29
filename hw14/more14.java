public class more14 {
	public static void main(String[] args) {
		int[] arr = {1, 4, 1};
		System.out.println(more14(arr));
		arr = new int[] {1, 4, 1, 4};
		System.out.println(more14(arr));
		arr = new int[] {1, 1};
		System.out.println(more14(arr));
	}

	public static boolean more14 (int[] intarr) {
		int one = 0;
		int four = 0;
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] == 1) {
				++one;
			}
			else if (intarr[i] == 4) {
				++four;
			}
		}
		if (one > four) {		//more 1s than 4s
			return true;
		}
		else {
			return false;
		}
	}

}
