public class OSArray extends SArray {
	public OSArray () {
		super();
	}
	@Override
	public boolean add (String s) {
		if (super.size() < 2) {
			if (super.size() == 0) {
				String[] tmpa = new String[1];
				tmpa[0] = new String (s);
				super.data = tmpa;
			}
			else if (super.size() == 1) {
				String[] tmpa = new String[2];
				if (super.get(0).compareTo(s) > 0) {
					tmpa[1] = new String(super.get(0));
					tmpa[0] = new String(s);
				}
				super.data = tmpa;
			}
		}
		else {
			for (int i = 0; i < (super.size() - 1); i++) {
/*
				if ((super.get(i).compareTo(s) < 0) && (super.get(i + 1).compareTo(s) > 0)) {
					//super.add(i - 1, s);
					String[] tmpa = new String [super.size() + 1];
					for (int a = 0; a < (i - 1); a++) {
						tmpa[a] = super.data[a];
					}
					tmpa[i - 1] = new String(s);    //set element at index to the item given
					for (int a = i; a < tmpa.length; a++) {
						tmpa[a] = super.data[a - 1];
					}
					super.data = tmpa;
					return true;
				}
				else */
				if ((super.get(i).compareTo(s) < 0) && (super.get(i).compareTo(s) > 0)) {
					//super.add(i + 1, s);
					String[] tmpa = new String [super.size() + 1];
					for (int a = 0; a < (i + 1); a++) {
						tmpa[a] = super.data[a];
					}
					tmpa[i + 1] = new String(s);    //set element at index to the item given
					for (int a = (i + 2); a < tmpa.length; a++) {
						tmpa[a] = super.data[a - 1];
					}
					super.data = tmpa;
					return true;
				}
				/*
				else if ((super.get(i + 1).compareTo(s) > 0)) {
					//super.add(i, s);
					String[] tmpa = new String [super.size() + 1];
					for (int a = 0; a < i; a++) {
						tmpa[a] = super.data[a];
					}
					tmpa[i] = new String(s);    //set element at index to the item given
					for (int a = (i + 1); a < tmpa.length; a++) {
						tmpa[a] = super.data[a - 1];
					}
					return true;
				}
*/
			}
			//super.add(s);
			if (super.get(super.size() - 1).compareTo(s) < 0) {
			String[] tmpa = new String [super.size() + 1];
			for (int a = 0; a < this.data.length; a++) {
				tmpa[a] = this.data[a];
			}
			tmpa[tmpa.length - 1] = new String(s);
			super.data = tmpa;
			System.out.println("nothing added");
			}
			else if (super.get(0).compareTo(s) > 0) {
			String[] tmpa = new String [super.size() + 1];
			for (int a = 1; a < super.data.length; a++) {
				tmpa[a] = super.data[a - 1];
			}
			tmpa[0] = new String(s);
			super.data = tmpa;
			System.out.println("nothing added");
			}
		}
		return true;
	}

	@Override
	public void add(int index, String s){

	}

}
