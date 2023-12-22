import acm.program.ConsoleProgram;

public class leetCode extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(maxScore(s));
	}

	private int maxScore(String s) {
		int ans = 0;
		int zeros = 0;
		int ones = 0;
		for (int i = 1; i < s.length(); i++) {
			String sub1 = s.substring(i, s.length());
			String sub2 = s.substring(0, i);
			for (int j = 0; j < sub1.length(); j++) {
				if (sub1.charAt(j) == 1) {
					ones++;
				}
			}
			for (int k = 0; k < sub2.length(); k++) {
				if (sub2.charAt(k) == 0) {
					zeros++;
				}
			}
			if ((zeros + ones) > ans) {
				ans = zeros + ones;
			}
		}
		return ans;
	}
}
