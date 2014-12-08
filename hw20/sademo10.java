import java.math.*;

public class sademo10 {
	public static void main(String[] args) {
		SArray sa = new SArray();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 1000; i++) {
			String tmp = new String("");
			for (int j = 0; j < 10; j++) {
				tmp = tmp + alpha.toCharArray()[(int)(Math.floor(Math.random() * 26))];
			}
			sa.add(tmp);
		}
	}

}
