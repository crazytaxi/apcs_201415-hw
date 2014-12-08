/* Michael Jin
	This super array class was based off Mr. Zamansky's template
	HW #19 - modified for strings
*/

public class SArray {
    String[] data;


	public SArray() {
		this.data = new String [] {};
	}

	public boolean add(String s){
		String[] tmpa = new String [this.data.length + 1];
		for (int a = 0; a < this.data.length; a++) {
			tmpa[a] = this.data[a];
		}
		tmpa[tmpa.length - 1] = new String(s);
		this.data = tmpa;
		return true;
	}

	public void isort (String s) {
		boolean entry = false;
		for (int i = 0; i < this.data.length; i++) {
			if (this.get(i).compareTo(s) > 0 && entry == false) {
				this.add(i, s);
				entry = !entry;
				break;
			}
		}
		if (entry == false) {
			this.add(s);
		}
	}

	public void bsort(String s) { 
		this.add(s);
		for (int pass = 1; pass < this.data.length; pass++ ) {
			for (int element = 0; element < this.data.length - 1; element++ ) {
				if (this.get(element).compareTo(this.get(element+1)) > 0 ) {
					String tmp = this.get(element);
					this.set(element, this.get(element+1));
					this.set(element+1, tmp);
				}
			}
		}
	}

	public void ssort(String s) {
		this.add(s);
		for (int j = 0; j < this.data.length-1; j++) {
		    int min_index = j;
		    for (int i = j+1; i < this.data.length; i++) { 
			if (this.get(i).compareTo(this.get(min_index)) < 0) {
			    min_index = i;
			}
		    }
		 
		    if(min_index != j) {
			String tmp = this.get(j);
			this.set(j, this.get(min_index));
			this.set(min_index, tmp);
		    }
		}
	}

	public boolean addcpy (String s) {
		String[] tmpa = new String [this.data.length + 1];
		System.arraycopy(this.data, 0, tmpa, 0, this.data.length);
		tmpa[tmpa.length - 1] = new String(s);
		this.data = tmpa;
		return true;
	}

	public boolean addcpy (int index, String s) {
		String[] tmpa = new String [this.data.length + 1];
		System.arraycopy(this.data, 0, tmpa, 0, index);
		tmpa[index] = s;
		System.arraycopy(this.data, index, tmpa, (index + 1), (this.data.length - index));
		this.data = tmpa;
		return true;
	}

	public void add(int index, String s){
		String[] tmpa = new String [this.data.length + 1];
		for (int a = 0; a < index; a++) {
			tmpa[a] = this.data[a];
		}
		tmpa[index] = s;	//set element at index to the item given
		for (int a = (index + 1); a < tmpa.length; a++) {
			tmpa[a] = this.data[a - 1];
		}
		this.data = tmpa;
	}

	public int size() {
		return this.data.length;
	}

	public String get(int index) {
		if (index >= this.data.length) {
			return null;
		}
		else if (index < 0) {
			return null;
		}
		return this.data[index];
	}

	public String set(int index, String s){
		String old = this.data[index];
		this.data[index] = new String (s);
		return old;
	}

	public String rmcpy(int index) {
		String[] tmpa = new String [this.data.length - 1];
		String removed_element = this.data[index];
		System.arraycopy(this.data, 0, tmpa, 0, index);
		System.arraycopy(this.data, (index + 1), tmpa, index, (this.data.length - (index + 1)));
		this.data = tmpa;
		return removed_element;
	}

	public String remove(int index) {
        // removes the item at index i
        // returns the old value
		String[] tmpa = new String [this.data.length - 1];
		for (int a = 0; a < index; a++) {
			tmpa[a] = this.data[a];
		}
		String removed_element = this.data[index];
		for (int a = index; a < tmpa.length; a++) {
			tmpa[a] = this.data[a + 1];
		}
		this.data = tmpa;
		return removed_element;
	}

        public void rmDup (int index) {
		if ((index + 1) < this.data.length) {
			this.rmDup((index + 1));
			if (this.get(index) == this.get((index + 1))) {
                                this.rmcpy((index + 1));
                        }
                }
        }

	public void rmDup () {
		this.rmDup(0);	//start the recursion
	}

	public void pString () {
		for (int i = 0; i < this.data.length; i++) {
			System.out.print(this.data[i] + ", ");
		}
		System.out.println();
		//System.out.println("Size: " + this.data.length);
	}
}
