import java.util.*;

public class generics_000 {
	public static void main(String[] args) {
		Searching s = new Searching();
		s.add(41249);
		s.add(291819);
		s.add(58);
		s.add(19284);
		Arrays.sort(s.getItems());
		System.out.println(s.rbsearch(41249));
	}
}
