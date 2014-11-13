/* Qijia (Michael) Jin
	generate an arraylist/SA and randomize the array
*/

import java.util.*;

public class sademo3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer> ();
		SArray sa = new SArray ();
		for (int i = 0; i < 20; i++) {
			al.add(new Integer(i));
			sa.add(i);
		}
		for (int i = 0; i < 400; i++) {
			int index = (int)(Math.floor(Math.random() * 20));
			al.add(0, al.remove(index));
			sa.add(0, sa.remove(index));
		}
		System.out.println(al);
		sa.pString();
	}
}
