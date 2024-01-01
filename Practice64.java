import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice64 extends ConsoleProgram {
	private String save;

	public void run() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		while (true) {
			ArrayList<String> list = new ArrayList<String>();
			String s = readLine();

			StringTokenizer tk = new StringTokenizer(s);
			int c = 0;
			while (tk.hasMoreTokens()) {
				String str = tk.nextToken();
				println(tk.nextToken());
				map.put(save, list);
			}
		}
	}
}
