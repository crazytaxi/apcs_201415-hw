public class wsDemo00 {
	public static void main (String[] args) {
		WordSearch ws = new WordSearch(20, 40);
		System.out.println(ws.toString());
		ws.addWH("HELLO", 3, 15, (int)'H');
		ws.addWH("LOOK", 3, 14, (int)'V');
		ws.addWH("LOOK", 3, 14, -(int)'V');
		ws.addWH("LOOK", 3, 14, -(int)'X');
		ws.addWH("LOOK", 3, 14, (int)'X');
		ws.addWH("LOOK", 3, 14, (int)'Y');
		ws.addWH("LOOK", 3, 14, -(int)'Y');
		System.out.println(ws.toString());
	}
}
