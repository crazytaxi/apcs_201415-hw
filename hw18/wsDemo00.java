public class wsDemo00 {
	public static void main (String[] args) {
		WordSearch ws = new WordSearch(20, 40);
		System.out.println(ws.toString());
		ws.addWH("HELLO", 3, 15);
		ws.addWH("LOOK", 3, 14);
		System.out.println(ws.toString());
	}
}
