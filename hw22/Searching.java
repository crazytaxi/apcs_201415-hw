import java.util.*;

public class Searching{
	private Object[] items;

	public Searching (int i) {
		this.items = new Object[i];
	}

	public Searching () {
		this(0);
	}

	public Object[] getItems() {
		return this.items;
	}

	public int add(Object o) {
		Object[] ta = new Object [this.items.length + 1];
		System.arraycopy(this.items, 0, ta, 0, this.items.length);
		ta[ta.length - 1] = o;
		this.items = ta;
		return 1;
	}

	public Object rbsearch(Object o) {
		return this.rbsearch(this.items, o, 0, (this.items.length - 1));
	}

	public Object lsearch(Object o) {
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i].equals(o)) {
				return this.items[i];
			}
		}
		return null;
	}

	public Object rbsearch(Object[] it, Object o, int imin, int imax) {
		if (imax < imin) {
			return null;
		}
		else {
	 		int imid = (imin + imax) / 2;
      			if ((it[imid].toString()).compareTo(o.toString()) > 0) {
				return rbsearch(it, o, imin, imid-1);
			}
			else if ((it[imid].toString()).compareTo(o.toString()) < 0) {
				return rbsearch(it, o, imid+1, imax);
			}
			else {
				return it[imid];
			}
		}
	}
}
