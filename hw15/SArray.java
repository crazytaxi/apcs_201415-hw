/* Michael Jin
	This super array class was based off Mr. Zamansky's template
*/

public class SArray {
    int[] data;
    //int last;

	public SArray() {
	// set up the initial instance variables
		this.data = new int [] {};
	//this.last = this.data.length;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
		int[] tmpa = new int [this.data.length + 1];
		for (int a = 0; a < this.data.length; a++) {
			tmpa[a] = this.data[a];
		}
		tmpa[tmpa.length - 1] = i;
		this.data = tmpa;
		//this.last = tmpa.length;
		return true;
    }

	public boolean addcpy (int i) {
		int[] tmpa = new int [this.data.length + 1];
		System.arraycopy(this.data, 0, tmpa, 0, this.data.length);
		tmpa[tmpa.length - 1] = i;
		this.data = tmpa;
		return true;
	}

    public void add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
		int[] tmpa = new int[this.data.length + 1];
		for (int a = 0; a < index; a++) {
			tmpa[a] = this.data[a];
		}
		tmpa[index] = i;	//set element at index to the item given
		for (int a = (index + 1); a < tmpa.length; a++) {
			tmpa[a] = this.data[a - 1];
		}
		this.data = tmpa;
    }

    public int size() {
        // returns the number of items in the list (not the array size)
		return this.data.length;
    }

    public int get(int index) {
		// returns the item at location index of the lsit
		if (index >= this.data.length) {
			return -1;
		}
		else if (index < 0) {
			return -1;
		}
		return this.data[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value.
		int old = this.data[index];
		this.data[index] = i;
		return old;
    }

	public int rmcpy(int index) {
		int[] tmpa = new int[this.data.length - 1];
		int removed_element = this.data[index];
		System.arraycopy(this.data, 0, tmpa, 0, index);
		System.arraycopy(this.data, (index + 1), tmpa, index, (this.data.length - (index + 1)));
		this.data = tmpa;
		return removed_element;
	}

	public int remove(int index) {
        // removes the item at index i
        // returns the old value
		int[] tmpa = new int[this.data.length - 1];
		for (int a = 0; a < index; a++) {
			tmpa[a] = this.data[a];
		} 
		int removed_element = this.data[index];
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
	}
}
