/*	Qijia (Michael) Jin
    create an array of 20 random integers from 1 to 5 and remove duplicates
*/

public class sademo2 {
	public static void main(String[] args) {
		SArray sa = new SArray();
		for (int i = 0; i < 20; i++) {
			sa.add((int)(Math.ceil(Math.random() * 5)));
		}
		sa.pString();
		sa.rmDup();
		sa.pString();
	}
}
