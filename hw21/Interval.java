import java.math.*;

public class Interval {
	private double l, h;

	public Interval () {
		this.h = Math.random() * 3141592;
		this.l = Math.random() * this.h;
	}

	public Interval (double a, double b) {
		if (a < b) {
			this.l = a;
			this.h = b;
		}
		else {
			this.l = b;
			this.h = a;
		}
	}

	public String toString () {
		return new String("[" + this.l + ", " + this.h + "]");
	}
}
