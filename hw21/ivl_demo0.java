import java.util.*;

public class ivl_demo0 {
	public static void main(String[] args) {
		Interval[] intervals = new Interval [5];
		for (int i = 0; i < intervals.length; i++) {
			intervals[i] = new Interval();
			System.out.println(intervals[i].toString());
		}
		Arrays.sort(intervals);
		for (int i = 0; i < intervals.length; i++) {
			System.out.println(intervals[i].toString());
		}
	}
}
