import java.io.*;

public class wsDemo01 {
	public static void main(String[] args) throws IOException{
		if (args.length == 0) {
			System.out.println("Please supply the name of the wordlist file!");
			System.exit(0);
		}
		WordSearch ws = new WordSearch(20, 40);
		BufferedReader read = new BufferedReader(new FileReader(args[0]));
		String line;
		while ((line = read.readLine()) != null) {
			ws.addR(line);
		}
			System.out.println(ws.toString());
	}
}
