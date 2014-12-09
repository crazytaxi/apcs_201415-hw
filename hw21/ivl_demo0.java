public class ivl_demo0 {
	public static void main(String[] args) {
		Interval[] intervals = new Interval [100];
		for (int i = 0; i < intervals.length; i++) {
			intervals[i] = new Interval();
			System.out.println(intervals[i].toString());
		}
	}
}
