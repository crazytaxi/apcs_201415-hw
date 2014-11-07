public class SArray {
    int[] data;
    int   last;

    public SArray() {
        // set up the initial instance variables
	this.data = new int [] {};
	this.last = this.data.length;
	System.out.println("Initial size: " + this.last);
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
	this.last = tmpa.length;
	System.out.println("Current size: " + this.data.length);
	return true;
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
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
	return -1;
    }

	public int remove(int index) {
        // removes the item at index i
        // returns the old value
		return -1;
	}

	public void pString () {
		for (int i = 0; i < this.last; i++) {
			System.out.print(this.data[i] + ", ");
		}
		System.out.println();
	}
}
