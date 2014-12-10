import java.util.*;
import java.math.*;

public class Interval implements Comparable {
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

	public int compareTo(Object oi) {
		double ldiff, hdiff;
		if (this.l == ((Interval)oi).getLow() && this.h == ((Interval)oi).getHigh()) {
			return 0;
		}
		else if ((ldiff = this.l - ((Interval)oi).getLow()) < 0) {
			return (int)ldiff;
		}
		else if ((hdiff = this.h - ((Interval)oi).getHigh()) > 0) {
			return (int)hdiff;
		}
		else {
			return 0;
		}
	}
}
