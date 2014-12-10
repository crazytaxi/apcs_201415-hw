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

	public double getLow() {
		return this.l;
	}

	public double getHigh() {
		return this.h;
	}

	public int compareTo(Interval oi) {
		double ldiff, hdiff;
		if (this.l == oi.getLow() && this.h == oi.getHigh()) {
			return 0;
		}
		else if ((ldiff = this.l - oi.getLow()) < 0) {
			return (int)ldiff;
		}
		else if ((hdiff = this.h - oi.getHigh()) > 0) {
			return (int)hdiff;
		}
		else {
			return 0;
		}
	}
}
