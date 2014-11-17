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
		for (int i = 0; i < 2000; i++) {
			int index0 = (int)(Math.floor(Math.random() * 20));
			int index1 = (int)(Math.floor(Math.random() * 20));
			al.add(index1, al.remove(index0));
			sa.add(index1, sa.remove(index0));
		}
		//System.out.println(al);
		//sa.pString();
		boolean match = true;
		for (int i = 0; i < al.size(); i++) {
			if (!((Integer)al.get(i)).equals((Integer)sa.get(i))){
				match = false;
				break;
			}
		}
		if (match) {
			System.out.println("Arrays match!");
		}
		else {
			System.out.println("Arrays do no match!");
		}
	}
}
