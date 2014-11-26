public class OSArray extends SArray {
	public OSArray () {
		super();
	}
	@Override
	public boolean add (String s) {
		if (super.size() < 1) {
			super.add(s);
		}
		else {
			for (int i = 0; i < (super.size() - 1); i++) {
				if ((super.get(i).compareTo(s) < 0) && (super.get(i + 1).compareTo(s) > 0)) {
					super.add(i, s);
					return true;
				}
				else if ((super.get(i).compareTo(s) < 0) && (super.get(i + 1).compareTo(s) == 0)) {
					super.add(i + 1, s);
					return true;
				}
				else if ((super.get(i).compareTo(s) == 0) && (super.get(i + 1).compareTo(s) > 0)) {
					super.add(i, s);
					return true;
				}
			}
			super.add(s);
			System.out.println("nothing added");
		}
		return true;
	}
}
