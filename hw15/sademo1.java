public class sademo1 {
	public static void main(String[] args) {
		SArray sa = new SArray();
		double t0, t1;
		t0 = System.nanoTime();
	for (int i = 0 ; i < 10000; i++) {
		sa.add(1337);
		//sa.pString();
	}
		t1 = System.nanoTime();
		System.out.println("iter: " + (t1 - t0)/(1000000000 * 10000));


		sa = new SArray();
		t0 = System.nanoTime();
	for (int i = 0; i < 10000; i++) {
		sa.addcpy(1337);
		//sa.pString();
	}
		t1 = System.nanoTime();
		System.out.println("cpy: " + (t1 - t0)/(1000000000 * 10000));
		//sa.add(100241);
		//sa.pString();
		//sa.add(0,123);
		//sa.pString();
		//sa.add(0,12351);
		//sa.pString();
		//sa.remove(0);
		//sa.pString();
	}

}
