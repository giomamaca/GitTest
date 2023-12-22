import acm.program.ConsoleProgram;

public class leetCode extends ConsoleProgram {
	public void run() {
		String[] strs = new String[5];
		strs[0] = "adamia";
		strs[1] = "adamiani";
		strs[2] = "adi";
		strs[3] = "admin";
		strs[4] = "adoli";
				
		println(longestCommonPrefix(strs));
	}

	private String longestCommonPrefix(String[] strs) {
		String ans = "";
		String s = strs[0];
		if (strs.length > 1) {
			for (int p = 0; p < s.length(); p++) {
				char a = s.charAt(p);
				for (int i = 1; i < strs.length; i++) {
					String st = strs[i];
					for (int j = 0; j < st.length(); j++) {
						char b = st.charAt(p);
						if (a != b) {
							return ans;
						}
					}
				}
				ans += a;
			}
		}
		if (strs.length == 1) {
			ans = strs[0];
		}
		return ans;
	}
}
